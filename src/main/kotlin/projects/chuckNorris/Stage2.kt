package projects.chuckNorris

/**
 * Stage 2/5: The binary world
 * https://hyperskill.org/projects/300/stages/1687/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage2() {
    // Intro
    println("Input string:")
    val userInput = readln()

    println("The result:")
    // Main loop
    for (ch in userInput) {
        val temp = Integer.parseInt(Integer.toBinaryString(ch.code))
        println("%c = %07d".format(ch, temp))
    }
}