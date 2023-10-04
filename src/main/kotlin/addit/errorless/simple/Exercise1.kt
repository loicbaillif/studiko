package addit.errorless.simple

/**
 * Exercise: Bitwise and integers
 * https://hyperskill.org/learn/step/15509
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Bitwise and integers ***")

    var number1 = 38
    var number2 = 54
    number1 = number1 shl 2
    number2 = number2 shr 1
    var result = number2 xor number1

    println("\n*** End of exercise ***")
}