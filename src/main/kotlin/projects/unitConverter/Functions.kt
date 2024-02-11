package projects.unitConverter


fun checkInput(userInput: Array<String>) {
    userInput[0] = checkNumber(userInput[0])
    userInput[1] = checkUnit(userInput[1])
}


fun checkInputSt3(userInput: Array<String>) {
    userInput[0] = checkNumber(userInput[0])
    userInput[1] = checkUnitDistance(userInput[1])
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
    val result = "error"

    if (distanceList.indexOf(input) != -1) return distanceList[0]

    return result
}

fun checkUnitDistance(input: String): String {
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val result = "error"

    for (elt in distancesList) {
        if (elt.indexOf(input) != -1) {
            println("This unit is valid : ${elt[0]}") // DEBUG
            return elt[0]
        }
    }

    println(UNIT_ERROR.format(input))
    return result
}


fun convert(userInput: Array<String>) {
    val originalDistance = userInput[0].toInt()
    val convertUnit = if (originalDistance > 1) "kilometers" else "kilometer"
    val convertedDistance = originalDistance * 1000

    println(OUTPUT_DISTANCE.format(originalDistance, convertUnit, convertedDistance))
}


fun convertDistanceSt3(userInput: Array<String>) {
    val sourceDistance = userInput[0].toFloat()
    val distancesList = arrayOf(distCm, distFt, distIn, distKm, distM, distMi, distMm, distYd)
    val arrayUnits = arrayOf("cm", "ft", "in", "km", "m", "mi", "mm", "yd")
    val indexSourceDistance = arrayUnits.indexOf(userInput[1])
}


fun getUserInput(): Array<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ").toTypedArray()

    return result
}