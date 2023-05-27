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
    var nbTurns = 0

    while (nbTurns < 9) {
        nbTurns = executeTurn(grid, nbTurns)
    }

    if (nbTurns == 9) println("draw")

}


fun executeTurn(grid: MutableList<MutableList<Char>>, nbTurns: Int): Int {
    // Variables
    var userInput: String
    val currentPlayer = if (nbTurns % 2 == 0) PLAYER1 else PLAYER2

    // Get and treat user input
    do {
        userInput = readln()
    } while (!isValidInput(userInput) || !isCellEmpty(grid, userInput))

    // Update grid and display it
    updateGrid(grid, userInput, currentPlayer)
    displayGrid2(grid)

    // Verify if winner
    if (nbTurns > 3) {
        // No possible winner before the 5th turn
        if (isWinner(grid, nbTurns)) return 10
    }

    // Finally increment counter
    return nbTurns + 1
}

fun isWinner(grid: MutableList<MutableList<Char>>, nbTurn: Int): Boolean {
    // Variables
    val currPl: Char = if (nbTurn % 2 == 0) PLAYER1 else PLAYER2
    val winList = mutableListOf(currPl, currPl, currPl)

    // Verify lines & columns
    for (i in 0..2) {
        val column = mutableListOf(grid[0][i], grid[1][i], grid[2][i])

        if (grid[i] == winList || column == winList) {
            println("$currPl wins")
            return true
        }
    }

    // Verify diagonals
    if (
        mutableListOf(grid[0][0], grid[1][1], grid[2][2]) == winList
        || mutableListOf(grid[0][2], grid[1][1], grid[2][0]) == winList
    ) {
        println("$currPl wins")
        return true
    }

    return false
}