package addit.stdLib.bigInt

/**
 * Exercise: Simple expression
 * https://hyperskill.org/learn/step/7968
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Simple expression ***")

    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val c = readln().toBigInteger()
    val d = readln().toBigInteger()
    println(-a * b + c - d)

    println("\n*** End of exercise ***")
}