package projects.unitConverter


fun checkInput(userInput: Array<String>): Unit {
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


fun getUserInput(): Array<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ").toTypedArray()

    return result
}