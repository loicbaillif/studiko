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

    // Conversion to Chuck Norris unary
    var previousDigit = 'C'
    var solution = ""
    for (ch in inputToBinary) {
        if (ch == previousDigit) solution += '0'
        else {
            previousDigit = ch
            solution += if (previousDigit == '0') " 00 0" else " 0 0"
        }
    }
    println(solution.substring(1))
}