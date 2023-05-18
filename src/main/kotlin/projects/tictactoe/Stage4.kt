package projects.tictactoe

/**
 * Stage 4 / 5: First move!
 * https://hyperskill.org/projects/123/stages/657/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

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
    }

    return false
}