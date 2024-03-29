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
    var someBigInt2 = 1234.toBigInteger()
    println("\t1234.toBigInteger() ==> ${someBigInt2::class.java.simpleName}")
    val someBigInt3 = "10987654321".toBigInteger()
    println("\t$someBigInt3.toBigInteger() ==> ${someBigInt3::class.java.simpleName}")


    println("\n*** 3) Arithmetic operations")
    println("\t$someBigInt3 + BigInteger.ONE = ${someBigInt3 + BigInteger.ONE}")
    println("\t$someBigInt3 - BigInteger.TEN = ${someBigInt3 - BigInteger.TEN}")
    println("\tBigInteger.TEN * BigInteger.TEN = ${BigInteger.TEN * BigInteger.TEN}")
    println("\t$someBigInt3 / BigInteger.TEN = ${someBigInt3 / BigInteger.TEN}")
    println("\t-BigInteger.TEN = ${-BigInteger.TEN }")
    println("\t$someBigInt2++ = ${++someBigInt2 }")
    println("\t$someBigInt2-- = ${--someBigInt2 }")


    println("\n*** 4) Functions of BigInteger")
    val oneHundredAndTen = 110.toBigInteger()
    val nine = 9.toBigInteger()
    val (result, remainder) = oneHundredAndTen.divideAndRemainder(nine)
    println("\tresult = $result; remainder = $remainder")
    println("\t-${BigInteger.TEN}.abs() = ${(-BigInteger.TEN).abs()} ")
    println("\t$someBigInt.gcd($someBigInt2) = ${someBigInt.gcd(someBigInt2)}")


    println("\n***** End of theory *****")
}