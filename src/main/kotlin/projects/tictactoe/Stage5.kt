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

    while (nbTurns < 9) {
        // Get and treat user input
        do {
            userInput = readln()
        } while (!isValidInput(userInput) || !isCellEmpty(grid, userInput))

        // Update grid and display it
        updateGrid(grid, userInput, playersList[nbTurns % 2])
        displayGrid2(grid)

        // Verify if winner
        if (nbTurns > 3) {
            // No possible winner before the 5th turn
            if (isWinner(grid, nbTurns)) break
        }

        // Finally increment counter
        nbTurns++
    }

}


fun isWinner(grid: MutableList<MutableList<Char>>, nbTurn: Int): Boolean {
    // Variables
    val currPl: Char = if (nbTurn % 2 == 0) PLAYER1 else PLAYER2

    // Verify lines & columns
    for (i in 0..2) {
        val column = mutableListOf(grid[0][i], grid[1][i], grid[2][i])

        if (
            grid[i] == mutableListOf(currPl, currPl, currPl)
            || column == mutableListOf(currPl, currPl, currPl)
        ) {
            println("$currPl wins")
            return true
        }
    }

    return false
}