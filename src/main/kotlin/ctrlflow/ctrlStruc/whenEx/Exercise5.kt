package ctrlflow.ctrlStruc.whenEx

import java.lang.NumberFormatException

/**
 * Exercise: Shape
 * https://hyperskill.org/learn/daily/4599
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ANSWER = "You have chosen a %s"

fun exercise5() {
    println("*** Exercise: Shape ***")

    // Variables
    val userInput = getUserInput()

    println("\n*** End of exercise ***")
}


fun getUserInput(): Int {
    var userInput = 0

    try {
        userInput = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Erroneous input")
    }

    return userInput
}