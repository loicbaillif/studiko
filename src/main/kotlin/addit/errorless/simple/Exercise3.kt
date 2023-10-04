package addit.errorless.simple

/**
 * Exercise: Fibonacci sum
 * https://hyperskill.org/learn/step/15513
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Fibonacci sum ***")

    var fibonacciPrevious = 1
    var fibonacciCurrent = 1
    var fibonacciSum = fibonacciPrevious + fibonacciCurrent

    while(true) {
        val tmp = fibonacciPrevious + fibonacciCurrent
        fibonacciPrevious = fibonacciCurrent
        fibonacciCurrent = tmp
        fibonacciSum += fibonacciCurrent
    }

    println("\n*** End of exercise ***")
}