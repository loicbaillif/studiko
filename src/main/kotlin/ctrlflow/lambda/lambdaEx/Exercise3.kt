package ctrlflow.lambda.lambdaEx

/**
 * Exercise: Function composition
 * https://hyperskill.org/learn/step/6161
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3(): (Int) -> Int {
    println("*** Exercise: Function composition ***")

    val g = { a: Int -> 3 * a }
    val h = { x: Int -> 3 + x }

    return { g(h(it)) }

    println("\n*** End of exercise ***")
}


