package projects.unitConverter

/**
 * Stage 4/5: Heavy duty
 * https://hyperskill.org/projects/70/stages/388/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    var userInput = arrayOf("init")
    do {
        userInput = getUserInputSt4()
        if (userInput[0] == "exit") continue

        checkInputSt4(userInput)
        if (userInput[0] == "error") continue

        println(userInput.joinToString(", ")) // DEBUG

        // New version
        val userDim = dimension(userInput);
        userDim.introduce() // DEBUG
        // End of new version

        println("Something to do") // DEBUG
    } while (userInput[0] != "exit")

    println("End of program") // DEBUG
}