package ctrlflow.func.declarFun

/**
 * Exercise: Vowel or not
 * https://hyperskill.org/learn/step/4586
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val VOWELS = "aeiou"

fun exercise4() {
    println("*** Exercise: Vowel or not ***")

    val letter = readln().first()
    println(isVowel(letter))

    println("\n*** End of exercise ***")
}


fun isVowel(letter: Char) = VOWELS.indexOf(letter.lowercaseChar()) != -1