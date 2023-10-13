package addit.stdLib.bigInt

import java.math.BigInteger

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
    val hundred = BigInteger(100)
    val per1 = a * hundred / sum
    val per2 = b * hundred / sum

    println("\n*** End of exercise ***")
}