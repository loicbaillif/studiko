package ctrlflow.except.howTo.tryCatFin

/**
 * Exercise: Finalizing
 * https://hyperskill.org/learn/step/11815
 * @author: JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Finalizing ***")

    try {
        throwException(data)
    } catch (e: Exception) {
        handleException(data)
    }

    println("\n*** End of exercise ***")
}