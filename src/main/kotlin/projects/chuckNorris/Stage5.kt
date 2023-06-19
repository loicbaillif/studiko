package projects.chuckNorris

/**
 * Stage 5/5 : Cooler than Chuck Norris
 * https://hyperskill.org/projects/300/stages/1690/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val invalidChoice = "There is no %s operation"
const val mainMenu = "Please input operation (encode/decode/exit):"

fun stage5() {
    var userChoice: Int
    do {
        userChoice = menu()
    } while (userChoice != -1)
}


fun menu(): Int {
    println(mainMenu)
    val userChoice = readln()
    when (userChoice) {
        "encode" -> println("Encode selected")
        "decode" -> println("Decode selected")
        "exit" -> return -1
        else -> println(invalidChoice.format(userChoice))
    }
    return 0
}