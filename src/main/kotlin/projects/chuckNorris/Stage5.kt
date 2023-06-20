package projects.chuckNorris

/**
 * Stage 5/5 : Cooler than Chuck Norris
 * https://hyperskill.org/projects/300/stages/1690/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val DECODE_ERROR = "Encoded string is not valid."
const val DECODE_MENU = "Input encoded string:"
const val DECODE_RESULT = "Decoded string:"
const val ENCODE_MENU = "Input string:"
const val ENCODE_RESULT = "Encoded string:\n"
const val INVALID_CHOICE = "There is no %s operation"
const val MAIN_MENU = "\nPlease input operation (encode/decode/exit):"

fun stage5() {
    var userChoice: Int
    do {
        userChoice = menu()
    } while (userChoice != -1)

    println("Bye!")
}


fun decode() {
    println(DECODE_MENU)
    // Variables
    val userInput = readln()

    // Exit if not valid
    if (!validEncoded(userInput)) {
        println(DECODE_ERROR)
        return
    }

    // Translate to binary
    val inputAsBinary = norrisToBinary(userInput)

    // Last validity check, length of binary string must be multiple of 7
    if (inputAsBinary.length % 7 != 0) {
        println(DECODE_ERROR)
        return
    }
    println(DECODE_RESULT)
    decodeBinary(inputAsBinary)
}


fun encode() {
    println(ENCODE_MENU)
    // Variables
    val userInput = readln()
    var inputToBinary = ""

    // Conversion to string of binaries
    for (ch in userInput) {
        val temp = Integer.parseInt(Integer.toBinaryString(ch.code))
        inputToBinary += "%07d".format(temp)
    }

    // Conversion to Chuck Norris unary
    var previousDigit = 'C'  // Random value else than 0 or 1
    var solution = ""
    for (ch in inputToBinary) {
        if (ch == previousDigit) solution += '0'
        else {
            previousDigit = ch
            solution += if (previousDigit == '0') " 00 0" else " 0 0"
        }
    }

    // Print result
    println(ENCODE_RESULT + solution.substring(1))
}


fun menu(): Int {
    println(MAIN_MENU)
    when (val userChoice = readln()) {
        "decode" -> decode()
        "encode" -> encode()
        "exit" -> return -1
        else -> println(INVALID_CHOICE.format(userChoice))
    }
    return 0
}


fun validEncoded(userInput: String): Boolean {
    // First check: '0' and ' ' only in encoded message
    for (ch in userInput) {
        if (ch != '0' && ch != ' ') return false
    }

    val splitInput = userInput.split(' ')

    // Second check: first block of each sequence can only be "0" or "00"
    for (i in 0..splitInput.lastIndex) {
        if (i % 2 != 0) continue
        if (splitInput[i] != "0" && splitInput[i] != "00") return false
    }

    // Third check: Number of blocks is odd
    if (splitInput.size % 2 != 0) return false

    return true
}