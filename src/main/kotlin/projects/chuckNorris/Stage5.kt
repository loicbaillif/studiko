package projects.chuckNorris

/**
 * Stage 5/5 : Cooler than Chuck Norris
 * https://hyperskill.org/projects/300/stages/1690/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val invalidChoice = "There is no %s operation"

fun stage5() {

}


fun menu() {
    val userChoice = readln()
    when (userChoice) {
        "encode" -> println("Encode selected")
        "decode" -> println("Decode selected")
        "exit" -> println("Exit selected")
        else -> println(invalidChoice.format(userChoice))
    }
}