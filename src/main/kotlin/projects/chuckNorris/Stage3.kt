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
    var inputToBinary = ""

    for (ch in userInput) {
        val temp = Integer.parseInt(Integer.toBinaryString(ch.code))
        inputToBinary = inputToBinary + temp
    }

    var previousDigit = inputToBinary[0]
    var nbConsecutive = 1
    if (previousDigit == '0') print("00") else print(0)
    for (index in 1..inputToBinary.lastIndex) {
        if (inputToBinary[index] == previousDigit) {
            nbConsecutive++
        }
    }

    println(inputToBinary) // DEBUG
}