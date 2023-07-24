package ctrlflow.ctrlStruc.whenEx

import java.lang.NumberFormatException

/**
 * Exercise: Shape
 * https://hyperskill.org/learn/daily/4599
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ANSWER = "You have chosen a %s"
const val INVALID = "There is no such shape!"

fun exercise5() {
    println("*** Exercise: Shape ***")

    // Variables
    val userInput = getUserInput()
    val shape = when (userInput) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        else -> "rhombus"
    }
    if (userInput == 0) println(INVALID) else println(ANSWER.format(shape))

    println("\n*** End of exercise ***")
}


fun getUserInput(): Int {
    var userInput = 0

    try {
        userInput = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Erroneous input")
    }

    if (userInput !in 0..4) userInput = 0

    return userInput
}