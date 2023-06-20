package projects.chuckNorris

/**
 * Stage 5/5 : Cooler than Chuck Norris
 * https://hyperskill.org/projects/300/stages/1690/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val decodeError = "Encoded string is not valid."
const val decodeMenu = "Input encoded string:"
const val decodeResult = "Decoded string:"
const val invalidChoice = "There is no %s operation"
const val mainMenu = "\nPlease input operation (encode/decode/exit):"

fun stage5() {
    var userChoice: Int
    do {
        userChoice = menu()
    } while (userChoice != -1)

    println("Bye!")
}


fun decode() {
    println(decodeMenu)
    // Variables
    val userInput = readln()

    // Exit if not valid
    if (!validEncoded(userInput)) {
        println(decodeError)
        return
    }

    // Translate to binary
    val inputAsBinary = norrisToBinary(userInput)

    // Last validity check, length of binary string must be multiple of 7
    if (inputAsBinary.length % 7 != 0) {
        println(decodeError)
        return
    }
    println(decodeResult)
    decodeBinary(inputAsBinary)
}


fun menu(): Int {
    println(mainMenu)
    when (val userChoice = readln()) {
        "decode" -> decode()
        "encode" -> println("Encode selected")
        "exit" -> return -1
        else -> println(invalidChoice.format(userChoice))
    }
    return 0
}


fun validEncoded(userInput: String): Boolean {
    // First check: '0' and ' ' only in encoded message
    for (ch in userInput) {
        if (ch != '0' && ch != ' ') return false
    }

    val splitInput = userInput.split(' ')

    // Second check: first block can only be "0" or "00"
    if (splitInput[0] != "0" && splitInput[0] != "00") return false

    // Third check: Number of blocks is odd
    if (splitInput.size % 2 != 0) return false

    return true
}