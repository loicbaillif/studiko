package typesDataStruct.strings.proc

/**
 * Exercise: Create an euphonious word
 * https://hyperskill.org/learn/step/9045
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val VOWELS = "aeiouy"

fun exercise2() {
    println("*** Exercise: Create an euphonious word ***")

    val userInput = readln()
    var result = 0 // Nb of letters to have to get an euphonious
    var consecutiveCount = 0 // nb of consecutive vow/cons
    var previousIsVowel = userInput.first() in VOWELS

    for (ch in userInput) {
        if (previousIsVowel == ch in VOWELS) {
            // The streak is on
            consecutiveCount++
        } else {
            // The streak is over
            result += (consecutiveCount - 1) / 2
            consecutiveCount = 1
        }
        previousIsVowel = ch in VOWELS
    }
    result += (consecutiveCount - 1) / 2

    println(result)

    println("\n*** End of exercise ***")
}