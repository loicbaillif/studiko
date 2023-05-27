package projects.tictactoe

/**
 * Stage 5 / 5 : Fight
 * https://hyperskill.org/projects/123/stages/658/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

// Constants
const val PLAYER1 = 'X'
const val PLAYER2 = 'O'

fun stage5() {
    // Variables
    val grid = createGrid("_________")
    val endGame = false
    var nbTurns = 0
    val playersList = mutableListOf<Char>(PLAYER1, PLAYER2)
    var userInput: String

    while (nbTurns < 8) {
        // Get and treat user input
        do {
            userInput = readln()
        } while (!isValidInput(userInput) || !isCellEmpty(grid, userInput))

        updateGrid(grid, userInput, playersList[nbTurns % 2])
        nbTurns++
    }

}