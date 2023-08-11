package ctrlflow.func.defaultArgs

import kotlin.math.abs

/**
 * Theory: Default Arguments
 * https://hyperskill.org/learn/step/4637
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Functions with default arguments")
    printQuote("I want to break free")
    printQuote("Hello", "!!!\n")
    printQuote()


    println("\n*** 2) Mixing default and regular arguments")

    println(findMax(3, 6))
    println(findMax(3, 6, true))
    println(findMax(-2, -4))
    println(findMax(-2, -4, true))


    println("\n***** End of theory *****")
}


fun printQuote(line: String = "\t\"", end: String = "\"\n") = print("$line$end")


fun findMax(n1: Int, n2: Int, absolute: Boolean = false): Int {
    val v1 = if (absolute) abs(n1) else n1
    val v2 = if (absolute) abs(n2) else n2

    return if (v1 > v2) n1 else n2
}