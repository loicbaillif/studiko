package ctrlflow.lambda.lambdaEx

/**
 * Exercise: Polynomial
 * https://hyperskill.org/learn/step/6162
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Polynomial ***")

    // Variables
    val a = 5
    val b = -2
    val c = 3

    val lambda: (Int) -> Int = { (a * it + b) * it + c }

    println("\n*** End of exercise ***")
}