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

    // Conversion to string of binary
    for (ch in userInput) {
        val temp = Integer.parseInt(Integer.toBinaryString(ch.code))
        inputToBinary += "%07d".format(temp)
    }

    // Output
    println("\nThe result:")
    println(inputToBinary) // DEBUG

    // Conversion to Chuck Norris unary
    var previousDigit = inputToBinary[0]
    if (previousDigit == '0') print("00 0") else print("0 0")
    for (index in 1..inputToBinary.lastIndex) {
        if (inputToBinary[index] == previousDigit) {
            print(0)
        } else {
            previousDigit = inputToBinary[index]
            if (previousDigit == '0') print(" 00 0") else print(" 0 0")
        }
    }
    println()
}