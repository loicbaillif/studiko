package basics.stdinout.strFormat

/**
 * Exercise: Dynamic Double formatting
 * https://hyperskill.org/learn/step/21446
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Dynamic Double formatting ***")

    println(doubleFormat(672.457, 7, 1))

    println("\n*** End of exercise ***")
}


fun doubleFormat(value: Double, width: Int, precision: Int): String {
    return String.format("%.${precision}f", value)
}