package projects.unitConverter

/**
 * Stage 4/5: Heavy duty
 * https://hyperskill.org/projects/70/stages/388/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    var userInput: Array<String>
    do {
        userInput = getUserInputSt4()
        if (userInput[0] == "exit") continue
        dimension(userInput)
    } while (userInput[0] != "exit")

    println("End of program") // DEBUG
}