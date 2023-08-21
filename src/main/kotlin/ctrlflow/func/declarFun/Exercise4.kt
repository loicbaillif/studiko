package ctrlflow.func.declarFun

/**
 * Exercise: Vowel or not
 * https://hyperskill.org/learn/step/4586
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val vowels = "aeiou"

fun exercise4() {
    println("*** Exercise: Vowel or not ***")


    println(vowels.indexOf('a'.lowercaseChar()))
    println(vowels.indexOf('b'.lowercaseChar()))
    println(vowels.indexOf('C'.lowercaseChar()))
    println(vowels.indexOf('E'.lowercaseChar()))

    println("\n*** End of exercise ***")
}


fun isVowel(letter: Char): Boolean {
    return vowels.indexOf(letter.lowercaseChar()) != -1
}