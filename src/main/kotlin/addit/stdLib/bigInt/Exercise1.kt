package addit.stdLib.bigInt

/**
 * Exercise: Division
 * https://hyperskill.org/learn/step/12547
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Division ***")

    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val (q, r) = a.divideAndRemainder(b)
    println("$a = $b * $q + $r")

    println("\n*** End of exercise ***")
}