package projects.tictactoe

/**
 * Stage 2 / 5 : The user is the gamemaster
 * https://hyperskill.org/projects/123/stages/655/implement
 * @author : JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage2() {
    val userInput = readln()
    displayGrid(userInput)
}


fun displayGrid(userInput: String): Unit {
    println("---------")    // Print grid upper border

    for (i in 0..2) {
        print("| ")         // Print grid left border
        for (j in 0..2) {
            print("${userInput[i * 3 + j]} ")
        }
        println("|")        // Print grid right border
    }

    println("---------")    // Print grid lower border
}