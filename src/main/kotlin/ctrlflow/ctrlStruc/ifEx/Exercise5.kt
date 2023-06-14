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
    val year = readln().toInt()

    println(if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) LEAP else REGULAR)

    println("\n*** End of exercise ***")
}