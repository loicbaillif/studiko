package projects.unitConverter

/**
 * Stage 2/5: Let's get metric
 * https://hyperskill.org/projects/70/stages/386/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage2() {
    val userInput = getUserInput() // ["distance"; "unit"]
    checkInput(userInput)

    if (userInput[0] == "error" || userInput[1] == "error") {
        println(INPUT_ERROR)
        return
    }

    convert(userInput)
}