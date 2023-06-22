package projects.encDec

import java.lang.NumberFormatException

/**
 * Stage 2/6: Knowledge is key
 * https://hyperskill.org/projects/279/stages/1416/implement
 * @author: JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"

fun stage2() {
    // Variables
    val userInput = readln()
    val userKey = try { readln().toInt() } catch (nonNumerical: NumberFormatException) { 0 }

    encodeWithKey(userInput, userKey)
}


fun encodeWithKey(userInput: String, key: Int) {
    for (ch in userInput) {
        if (ch.lowercaseChar() !in ALPHABET) {
            print(ch)
            continue
        }
        val posInAlphabet = ch.lowercaseChar() - 'a'
        print(ALPHABET[(posInAlphabet + key) % ALPHABET.length])
    }
}