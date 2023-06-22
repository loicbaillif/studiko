package projects.encDec

/**
 * Stage 2/6: Knowledge is key
 * https://hyperskill.org/projects/279/stages/1416/implement
 * @author: JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"

fun stage2() {
    val userInput = "welcome to hyperskill" // DEBUG
    val userKey = 5
    encodeWithKey(userInput, userKey)
}


fun encodeWithKey(userInput: String, key: Int) {
    for (ch in userInput) {
        if (ch.lowercaseChar() !in ALPHABET) {
            print(ch)
            continue
        }
        val posInAlphabet = ch.lowercaseChar() - 'a'
        // print(posInAlphabet) // DEBUG
        print(ALPHABET[(posInAlphabet + key) % ALPHABET.length])
    }
}