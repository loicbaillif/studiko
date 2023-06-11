package projects.chuckNorris

/**
 * Stage 3/5: huck Norris encrypts only with zeros
 * https://hyperskill.org/projects/300/stages/1688/implement#comment
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage3() {
    // Intro
    println("Input string:")
    val userInput = readln()
    var inputToBinary: String = ""

    for (ch in userInput) {
        val temp = Integer.parseInt(Integer.toBinaryString(ch.code))
        inputToBinary = inputToBinary + temp
    }

    println(inputToBinary) // DEBUG
}