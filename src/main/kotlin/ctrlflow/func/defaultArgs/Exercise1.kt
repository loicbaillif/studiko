package ctrlflow.func.defaultArgs

/**
 * Exercise: Polynomial
 * https://hyperskill.org/learn/step/7857
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Polynomial ***")



    println("\n*** End of exercise ***")
}


fun polynom(x: Int, c: Int, b: Int = 0, a: Int = 0) = (a * x + b) * x + c