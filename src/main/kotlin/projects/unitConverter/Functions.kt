package projects.unitConverter


fun checkInput(userInput: Array<String>) {
    userInput[0] = checkNumber(userInput[0])
    userInput[1] = checkUnit(userInput[1])
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
    val distCm = arrayOf("cm", "centimeter", "centimeters")
    val distFt = arrayOf("ft", "foot", "feet")
    val distIn = arrayOf("in", "inch", "inches")
    val distKm = arrayOf("km", "kilometer", "kilometers")
    val distM = arrayOf("m", "meter", "meters")
    val distMi = arrayOf("mi", "mile", "miles")
    val distMm = arrayOf("mm", "millimeter", "millimeters")
    val distYd = arrayOf("yd", "yard", "yards")
}


fun convert(userInput: Array<String>) {
    val originalDistance = userInput[0].toInt()
    val convertUnit = if (originalDistance > 1) "kilometers" else "kilometer"
    val convertedDistance = originalDistance * 1000

    println(OUTPUT_DISTANCE.format(originalDistance, convertUnit, convertedDistance))
}


fun getUserInput(): Array<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ").toTypedArray()

    return result
}