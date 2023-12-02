package addit.stdLib.mathLib

/**
 * Exercise: Fractional part
 * https://hyperskill.org/learn/step/4513
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Fractional part ***")

    println(((readln().toDouble() % 1) * 10).toInt())

    println("\n*** End of exercise ***")
}