package projects.unitConverter


fun checkInput(userInput: Array<String>): Unit {
    userInput[0] = checkNumber(userInput[0])
}


fun checkNumber(input: String): String {
    val result = "error"
    val inputAsInt: Int

    try {
        inputAsInt = input.toInt()
    } catch (e: NumberFormatException) {
        return result
    }

    return input
}

fun getUserInput(): Array<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ").toTypedArray()

    return result
}