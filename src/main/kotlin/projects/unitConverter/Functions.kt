package projects.unitConverter


fun checkInput(userInput: List<String>) {

}

fun getUserInput(): List<String> {
    println(INPUT_PROMPT)
    val userInput = readln()
    val result = userInput.lowercase().split(" ");

    return result
}