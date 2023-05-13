package projects.tictactoe

/**
 * Stage 3 / 5 : What's up on the field?
 * https://hyperskill.org/projects/123/stages/656/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */


const val PLAYER_1 = 'O'
const val PLAYER_2 = 'X'

fun stage3() {
    // Variables
    val userInput = readln()

    // Display Grid & result
    displayGrid(userInput)
    println(displayResult(userInput))

}


// FUNCTIONS

fun checkWin(grid: String, player: Char): Boolean {
    val gridUp = grid.uppercase()
    val playerUp = player.uppercaseChar()

    // 1) Check horizontal lines
    for (i in 0..2) {
        if (gridUp[3 * i + 0] == gridUp[3 * i + 1] &&
            gridUp[3 * i + 1] == gridUp[3 * i + 2] &&
            gridUp[3 * i + 2] == playerUp) return true
    }

    // 2) Check vertical lines
    for (i in 0..2) {
        if (gridUp[i] == gridUp[i + 3] &&
            gridUp[i + 3] == gridUp[i + 6] &&
            gridUp[i + 6] == playerUp) return true
    }

    // 3) Check diagonals
    if (gridUp[0] == playerUp && gridUp[4] == playerUp && gridUp[8] == playerUp) return true
    if (gridUp[2] == playerUp && gridUp[4] == playerUp && gridUp[6] == playerUp) return true


    return false
}



fun countElts(userInput: String): MutableList<Int> {
    var numO = 0
    var numX = 0

    for (c in userInput) {
        if (c.uppercaseChar() == PLAYER_1) numO++
        if (c.uppercaseChar() == PLAYER_2) numX++
    }

    return mutableListOf(numO, numX)
}


fun displayResult(userInput: String): String {
    val nbElts = countElts(userInput) // mutableListOf(nb_o, nb_x)
    val totalElts = nbElts[0] + nbElts[1] // sum of o and x
    val validDeltaElts = (nbElts[0] - nbElts[1] in -1..1)

    if (!validDeltaElts) return "Impossible"

    if (checkWin(userInput, PLAYER_1)) {
        if (checkWin(userInput, PLAYER_2)) return "Impossible"
        return "O wins"
    }

    if (checkWin(userInput, PLAYER_2)) return "X wins"

    if (totalElts == 9) return "Draw"

    return "Game not finished"
}
