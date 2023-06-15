package ctrlflow.ctrlStruc.whenEx

import java.lang.NumberFormatException

/**
 * Exercise: Shape
 * https://hyperskill.org/learn/daily/4599
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Shape ***")

    // Variables
    var userInput = 0
    try {
        userInput = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Erroneous input")
    } finally {
        println("user input = $userInput") // DEBUG
    }


    println("\n*** End of exercise ***")
}