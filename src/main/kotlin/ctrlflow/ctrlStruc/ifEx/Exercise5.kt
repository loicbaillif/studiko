package ctrlflow.ctrlStruc.ifEx

/**
 * Exercise: Leap year
 * https://hyperskill.org/learn/daily/4596
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val LEAP = "Leap"
const val REGULAR = "Regular"

fun exercise5() {
    println("*** Exercise: Leap year ***")

    // Variable
    val userInput = readln().toInt()

    if (userInput % 4 == 0 && userInput % 100 != 0 || userInput % 400 == 0) {
        // Leap?
        println(LEAP)
    } else {
        println(REGULAR)
    }

    println("\n*** End of exercise ***")
}