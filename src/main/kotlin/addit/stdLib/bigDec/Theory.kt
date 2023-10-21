package addit.stdLib.bigDec

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Theory: BigDecimal
 * https://hyperskill.org/learn/step/12536
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Creating objects of BigDecimal")
    val bigDecimal1 = BigDecimal("123456789.135792468") // From String
    // val bigDecimal2 = BigDecimal(readln()) // From user input
    println("\tBigDecimal1 = $bigDecimal1")
    // println("\tBigDecimal2 = $bigDecimal2")
    val bigDecimal3 = BigDecimal(123456789.13579246)
    println("\tBigDecimal3 = $bigDecimal3")

    val someNumber1 = 123.45
    val bigDecimal4 = someNumber1.toBigDecimal()
    println("\tbigDecimal4 = $bigDecimal4")
    println("\tBigDecimal.ZERO = ${BigDecimal.ZERO}")
    println("\tBigDecimal.ONE = ${BigDecimal.ONE}")
    println("\tBigDecimal.TEN = ${BigDecimal.TEN}")

    println("\n*** 2) Arithmetic Operations\n")
    println("********************************")
    println("*** BigDecimal ARE IMMUTABLE ***")
    println("********************************\n")
    println("Float lack of accuracy: 0.2 + 0.1 = ${0.2 + 0.1}") // Different than 0.3
    var bigDecimal5 = BigDecimal("0.1")
    val bigDecimal6 = BigDecimal("0.2")
    println("\t. oneBD = $bigDecimal5\n\t. twoBD = $bigDecimal6")
    println("\nBinary operations")
    println("\t. oneBD + twoBD = ${bigDecimal5 + bigDecimal6}")
    println("\t. oneBD - twoBD = ${bigDecimal5 - bigDecimal6}")
    println("\t. oneBD * twoBD = ${bigDecimal5 * bigDecimal6}")
    println("\t. oneBD / twoBD = ${bigDecimal5 / bigDecimal6}")
    println("\t. oneBD % twoBD = ${bigDecimal5 % bigDecimal6}")
    println("\nUnary operations")
    bigDecimal5++
    println("\t. oneBD++ = $bigDecimal5")
    println("\t. ++oneBD = ${++bigDecimal5}")
    bigDecimal5--
    println("\t. oneBD-- = $bigDecimal5")
    println("\t. --oneBD = ${--bigDecimal5}")
    println("\t. -oneBD = ${-bigDecimal5}")
    println("\t. (oneBD - twoBD).abs()")

    println("\n*** 3) Rounding Control")
    val bigDecimal7 = 987.12345.toBigDecimal();
    println("\t$bigDecimal7.scale() = ${bigDecimal7.scale()}")


    println("\n*** 4) Rounding examples")
    println("\t$bigDecimal7.setScale(4, RoundingMode.CEILING) = " +
            "${bigDecimal7.setScale(4, RoundingMode.CEILING)}")
    println("\t$bigDecimal7.setScale(4, RoundingMode.CEILING) = " +
            "${bigDecimal7.setScale(4, RoundingMode.HALF_DOWN)}")
    println("\t$bigDecimal7.setScale(8, RoundingMode.CEILING) = " +
            "${bigDecimal7.setScale(8, RoundingMode.UNNECESSARY)}")


    println("\n***** End of Theory *****")
}