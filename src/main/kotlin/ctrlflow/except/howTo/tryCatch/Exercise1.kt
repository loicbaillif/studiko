package ctrlflow.except.howTo.tryCatch

/**
 * Exercise: Exception message
 * https://hyperskill.org/learn/step/10627
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Exception Message ***")

    try {
        problemFunction()
    } catch (e: Exception) {
        println()
    }

    println("\n*** End of exercise ***")
}