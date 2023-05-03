package projects.tictactoe

/**
 * Stage 2 / 5 : The user is the gamemaster
 * https://hyperskill.org/projects/123/stages/655/implement
 * @author : JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage2() {
    displayGrid("XOXOXOXOX")
}


fun displayGrid(userInput: String): Unit {
    println("---------") // Print table upper border

    for (i in 1..3) {
        print("|")
        for (j in 1..3) {
        }
        println("|")
    }

    println("---------") // Print table lower border
}