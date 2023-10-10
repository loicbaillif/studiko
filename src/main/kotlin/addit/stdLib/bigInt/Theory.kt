package addit.stdLib.bigInt

import java.math.BigInteger

/**
 * Theory: BigInteger
 * https://hyperskill.org/learn/step/7964
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Overflow example")

    val maxInt = Int.MAX_VALUE
    println("maxInt = $maxInt\t\t;\tmaxInt + 1 = ${maxInt + 1}")


    println("\n*** 2) Creating a BigInteger object")
    val someBigInt = BigInteger("12345678910")
    println("\tBigInteger.ZERO = ${BigInteger.ZERO}")
    println("\tBigInteger.ONE = ${BigInteger.ONE}")
    println("\tBigInteger.TEN = ${BigInteger.TEN}")

    println("\n***** End of theory *****")
}