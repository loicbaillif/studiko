package ctrlflow.ctrlStruc.jumpRet

/**
 * Exercise: Unique characters
 * https://hyperskill.org/learn/step/7868
 * @author JetBrains Academy
 * Solution By Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Unique characters ***")

    val userInput = readln()
    val sortedInput = userInput.toCharArray().sorted().joinToString()

    println("\n*** End of exercise ***")
}