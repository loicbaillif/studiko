package addit.stdLib.bigDec

import java.math.BigDecimal

/**
 * Theory: BigDecimal
 * https://hyperskill.org/learn/step/12536
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Creating objects of BigDecimal")
    val bigDecimal1 = BigDecimal("123456789.135792468") // From String
    val bigDecimal2 = BigDecimal(readln()) // From user input
    println("\tBigDecimal1 = $bigDecimal1")
    println("\tBigDecimal2 = $bigDecimal2")
    val bigDecimal3 = BigDecimal(123456789.13579246)
    println("\tBigDecimal3 = $bigDecimal3")


    println("\n***** End of Theory *****")
}