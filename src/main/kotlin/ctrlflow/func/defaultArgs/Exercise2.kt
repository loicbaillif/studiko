package ctrlflow.func.defaultArgs

/**
 * Exercise: Gratuity
 * https://hyperskill.org/learn/step/7858
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Gratuity ***")

    println(tip(128))
    println(tip(128, 8))

    println("\n*** End of exercise ***")
}


fun tip(bill: Int, percentage: Int = 10): Int = bill * percentage / 100