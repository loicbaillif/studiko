package addit.stdLib.bigInt

import java.math.BigInteger

/**
 * Exercise: Max
 * https://hyperskill.org/learn/step/12546
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Max ***")

    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    println((a + b + (a - b).abs()) / BigInteger.TWO)

    println("\n*** End of exercise ***")
}