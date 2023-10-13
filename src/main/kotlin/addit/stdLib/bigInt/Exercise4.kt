package addit.stdLib.bigInt

/**
 * Exercise: Percentage
 * https://hyperskill.org/learn/step/7971
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Percentage ***")

    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val sum = a + b
    val hundred = 100.toBigInteger()
    val per1 = a * hundred / sum
    val per2 = b * hundred / sum
    println("$per1% $per2%")

    println("\n*** End of exercise ***")
}