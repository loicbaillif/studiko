package projects.unitConverter

/**
 * Stage 3/5: Distances
 * https://hyperskill.org/projects/70/stages/386/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage3() {
    val userInput = getUserInput() // ["distance"; "unit"]
    checkInputSt3(userInput)

    if (userInput[0] == "error") {
        println(INPUT_ERROR)
        return
    }

    if (userInput[1] == "error") return

    convertDistanceSt3(userInput)
}