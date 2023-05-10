package projects.tictactoe

/**
 * Stage 3 / 5 : What's up on the field?
 * https://hyperskill.org/projects/123/stages/656/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage3() {
    // Variables
    val userInput = readln()
    val grid: MutableList<MutableList<Char>> = mutableListOf()

    // Display Grid
    displayGrid(userInput)
}


fun fillGrid(userInput: String): MutableList<MutableList<Char>> {
    // Create 2D list for grid
    val userGrid: MutableList<MutableList<Char>> = mutableListOf(
        mutableListOf(),
        mutableListOf(),
        mutableListOf()
    )

    // Fill grid
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            userGrid[i][j] = userInput[i * 3 + j]
        }
    }

    return userGrid
}