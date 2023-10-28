package addit.stdLib.bigDec

import java.math.RoundingMode

/**
 * Exercise: Rounding with a given precision
 * https://hyperskill.org/learn/step/12542
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Rounding with a given precision ***")

    val userNumber = readln().toBigDecimal()
    val newScale = readln().toInt()
    println(userNumber.setScale(newScale, RoundingMode.HALF_DOWN))

    println("\n*** End of exercise ***")
}