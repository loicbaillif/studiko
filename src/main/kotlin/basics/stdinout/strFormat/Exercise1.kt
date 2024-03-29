package basics.stdinout.strFormat

/**
 * Exercise: Format Double with a comma and 2 decimal digits
 * https://hyperskill.org/learn/step/21445
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Format Double with a comma and 2 decimal digits ***")

    println(String.format("%,.2f", readln().toDouble()))

    println("\n*** End of exercise ***")
}