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

fun checkEncoded(userInput: String): Boolean {

}


fun decode() {
    println(decodeMenu)
    // Variables
    val userInput = readln()

    // Exit if not valid


    // Decode if valid
    val inputAsBinary = norrisToBinary(userInput)
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