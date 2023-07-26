package basics.stdinout.strFormat

/**
 * Exercise: Format a table
 * https://hyperskill.org/learn/daily/21447
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Format a table ***")

    // Variables
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val d = readln().toDouble()

    println("%${12}s%${12}s".format(a, b))
    println("%${12}s%${12}s".format(c, d))

    println("\n*** End of exercise ***")
}