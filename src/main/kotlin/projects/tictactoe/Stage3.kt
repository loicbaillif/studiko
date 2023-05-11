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
    val grid: MutableList<MutableList<Char>> = fillGrid(userInput)

    // Display Grid
    displayGrid(userInput)
    println(grid)

    // DEBUG
    println(countElts(userInput))
    println(checkWin(userInput, 'X'))
}


// FUNCTIONS

fun checkWin(grid: String, player: Char): Boolean {

    // 1) Check horizontal lines
    for (i in 0..2) {
        if (grid[3 * i + 0] == grid[3 * i + 1] &&
            grid[3 * i + 1] == grid[3 * i + 2] &&
            grid[3 * i + 2] == player.uppercaseChar()) return true
    }

    // 2) Check vertical lines
    for (i in 0..2) {
        if (grid[i] == grid[i + 3] &&
            grid[i + 3] == grid[i + 6] &&
            grid[i + 6] == player.uppercaseChar()) return true
    }

    // 3) Check diagonals
    // TODO


    return false
}



fun countElts(userInput: String): MutableList<Int> {
    var numO = 0
    var numX = 0

    for (c in userInput) {
        if (c.uppercaseChar() == 'O') numO++
        if (c.uppercaseChar() == 'X') numX++
    }

    return mutableListOf(numO, numX)
}


fun fillGrid(userInput: String): MutableList<MutableList<Char>> {
    // Create 2D list for grid
    val userGrid: MutableList<MutableList<Char>> = mutableListOf(
        MutableList(3) {'_'},
        MutableList(3) {'_'},
        MutableList(3) {'_'}
    )

    // Fill grid
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            userGrid[i][j] = userInput[i * 3 + j]
        }
    }

    return userGrid
}