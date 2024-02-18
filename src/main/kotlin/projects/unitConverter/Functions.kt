package projects.unitConverter


fun checkInput(userInput: Array<String>) {
    userInput[0] = checkNumber(userInput[0])
    userInput[1] = checkUnit(userInput[1])
}


fun checkInputSt3(userInput: Array<String>) {
    userInput[0] = checkDouble(userInput[0])
    userInput[1] = checkUnitDistance(userInput[1])
}


fun checkInputSt4(userInput: Array<String>) {
    // 1. Ensure there are 4 "words" e.g. 100 CM in KM
    if (userInput.size != 4) {
        userInput[0] = "error"
        println(REQUEST_ERROR)
        return
    }

    // 2. Ensure first elt is a number
    userInput[0] = checkDouble(userInput[0])
    if (userInput[0] == "error") return

    // 3. Ensure second and fourth elements are consistent units
    checkUnitSt4(userInput)
}


fun checkDouble(input: String): String {
    val error = "error"
    val inputAsDouble: Double

    try {
        inputAsDouble = input.toDouble()
    } catch (e: NumberFormatException) {
        println(INVALID_FIGURE.format(input))
        return error
    }

    if (inputAsDouble < 0.0) return error

    return input
}


fun checkNumber(input: String): String {
    val result = "error"
    val inputAsInt: Int

    try {
        inputAsInt = input.toInt()
    } catch (e: NumberFormatException) {
        return result
    }

    if (inputAsInt < 0) return result

    return input
}


fun checkUnit(input: String): String {
    val distanceList = arrayOf("km", "kilometer", "kilometers")
    val error = "error"

    if (distanceList.indexOf(input) != -1) return distanceList[0]

    return error
}

fun checkUnitDistance(input: String): String {
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val error = "error"

    for (elt in distancesList) {
        if (elt.indexOf(input) != -1) return elt[0]
    }

    println(UNIT_ERROR.format(input))
    return error
}


fun checkUnitSt4(userInput: Array<String>): Boolean {
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val weightList = arrayOf(weightG, weightKg, weightLb, weightMg, weightOz)
    val error = "error"
    var firstUnit = "???"
    var firstUnitPlural = ""
    var secondUnit = "???"
    var secondUnitPlural = ""

    for (elt in distancesList) {
        if (elt.indexOf(userInput[1]) != -1) {
            firstUnit = "distance"
            userInput[1] = elt[0] // Transform 1st unit to its abbreviated version
            firstUnitPlural = elt[2] // Store plural form to generate error message
        }
        if (elt.indexOf(userInput[3]) != -1) {
            secondUnit = "distance"
            userInput[3] = elt[0] // Transform 2nd unit to its abbreviated version
            secondUnitPlural = elt[2] // Store plural form to generate error message
        }

        if (firstUnit == "distance" && secondUnit == "distance") break // break if 2 units match distance
    }

    for (elt in weightList) {
        if (firstUnit == "distance" && secondUnit == "distance") break

        if (elt.indexOf(userInput[1]) != -1) {
            firstUnit = "weight"
            userInput[1] = elt[0] // Transform 1st unit to its abbreviated version
            firstUnitPlural = elt[2] // Store plural form to generate error message
        }
        if (elt.indexOf(userInput[3]) != -1) {
            secondUnit = "weight"
            userInput[3] = elt[0] // Transform 2nd unit to its abbreviated version
            secondUnitPlural = elt[2] // Store plural form to generate error message
        }

        if (firstUnit == "weight" && secondUnit == "weight") break // break if 2 units match weight
    }


    return false
}


fun convert(userInput: Array<String>) {
    val originalDistance = userInput[0].toInt()
    val convertUnit = if (originalDistance > 1) "kilometers" else "kilometer"
    val convertedDistance = originalDistance * 1000

    println(OUTPUT_DISTANCE.format(originalDistance, convertUnit, convertedDistance))
}


fun convertDistanceSt3(userInput: Array<String>) {
    // Variables
    val sourceDistance = userInput[0].toDouble()
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val arrayUnits = arrayOf("cm", "ft", "in", "km", "m", "mi", "mm", "yd")
    val arrayConversion = arrayOf(M_PER_CM, M_PER_FT, M_PER_IN, M_PER_KM, M_PER_M, M_PER_MI, M_PER_MM, M_PER_YD)
    val indexSourceDistance = arrayUnits.indexOf(userInput[1])
    val sourceUnit = distancesList[indexSourceDistance][if (sourceDistance == 1.0) 1 else 2]

    // Calculus
    val result = sourceDistance * arrayConversion[indexSourceDistance]
    println("$sourceDistance $sourceUnit is $result meter${if (result == 1.0) "" else "s"}") // DEBUG

}


fun getUserInput(): Array<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ").toTypedArray()

    return result
}


fun getUserInputSt4(): Array<String> {
    println(INPUT_PROMPT_ST4)
    val userInput = readln()
    return userInput.lowercase().split(" ").toTypedArray()
}