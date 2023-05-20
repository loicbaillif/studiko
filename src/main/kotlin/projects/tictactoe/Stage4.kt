package projects.tictactoe

/**
 * Stage 4 / 5: First move!
 * https://hyperskill.org/projects/123/stages/657/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ERROR_NOT_EMPTY = "This cell is occupied! Choose another one!"
const val ERROR_NUMBERS = "You should enter numbers!"
const val ERROR_RANGE = "Coordinates should be from 1 to 3!"

fun stage4() {

    var startGrid = readln()
    displayGrid(startGrid)
    do {
        val userInput = readln()
    } while (!isValidInput(userInput) || !isCellEmpty(startGrid, userInput))

}


fun isCellEmpty(grid: String, userInput: String): Boolean {
    // TODO
    val inputPosition = (userInput[0].digitToInt() - 1) * 3 + userInput[2].digitToInt() - 1

    if (grid[inputPosition] != '_') {
        println(ERROR_NOT_EMPTY)
        return false
    }


    return true
}



fun isValidInput(userInput: String): Boolean {
    // Returns true if and only if the input is valid
    // Elsewhere prints the reason for error, and returns false
    if ((userInput.length != 3) || (userInput[1] != ' ')) {
        println(ERROR_NUMBERS)
        return false
    }

    if ((userInput[0] !in '0'..'9') || (userInput[2] !in '0'..'9')) {
        println(ERROR_NUMBERS)
        return false
    }

    if ((userInput[0] !in '1'..'3') || (userInput[2] !in '1'..'3')) {
        println(ERROR_RANGE)
        return false
    }

    return true
}