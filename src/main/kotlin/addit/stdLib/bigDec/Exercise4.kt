package addit.stdLib.bigDec

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Exercise: Average
 * https://hyperskill.org/learn/step/12541
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Average ***")

    val userInput1 = readln().toBigDecimal()
    val userInput2 = readln().toBigDecimal()
    val userInput3 = readln().toBigDecimal()
    val sum = userInput1 + userInput2 + userInput3
    println((sum / BigDecimal(3)).setScale(0, RoundingMode.DOWN))

    println("\n*** End of exercise ***")
}