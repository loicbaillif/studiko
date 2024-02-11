package projects.unitConverter


fun checkInput(userInput: Array<String>): Unit {
    try {
        val tempNumber = userInput[0].toInt()
    } catch (e: NumberFormatException) {
        userInput[0] = "error"
    }
}


fun checkNumber(input: String): String {

}

fun getUserInput(): Array<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ").toTypedArray()

    return result
}