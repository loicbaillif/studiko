package addit.stdLib.bigDec

import java.math.RoundingMode

/**
 * Exercise: Round and power
 * https://hyperskill.org/learn/step/14620
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Round and power ***")

    val power = readln().toInt()
    val mode = readln().toInt()
    val number = readln().toBigDecimal()

    println(number.setScale(mode, RoundingMode.DOWN))

    println("\n*** End of exercise ***")
}