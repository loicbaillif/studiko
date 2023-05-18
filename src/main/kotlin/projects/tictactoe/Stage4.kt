package projects.tictactoe

/**
 * Stage 4 / 5: First move!
 * https://hyperskill.org/projects/123/stages/657/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ERROR_NUMBERS = "You should enter numbers!"

fun stage4() {
    var startGrid = readln()
    displayGrid(startGrid)
}


fun isCellEmpty(grid: String, userInput: String): Boolean {
    // TODO


    return false
}



fun isValidInput(userInput: String): Boolean {
    // TODO
    if (userInput.length != 3) {
        println("You should use \"X Y\" format!")
        return false
    }

    if (userInput[0] !in '0'..'9' && userInput[2] !in '0'..'9') {
        println(ERROR_NUMBERS)
        return false
    }

    return false
}