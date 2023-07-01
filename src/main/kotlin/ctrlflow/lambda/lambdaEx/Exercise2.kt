package ctrlflow.lambda.lambdaEx

/**
 * Exercise: Max
 * https://hyperskill.org/learn/step/6160
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Max ***")

    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> if (a > b) a else b }

    println("\n*** End of exercise ***")
}