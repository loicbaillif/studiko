package ctrlflow.except.howTo.tryCatFin

/**
 * Theory: The try-catch-finally statement
 * https://hyperskill.org/learn/step/11809
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) The finally block ***")

    try {
        // Code which might throw an exception
    } catch (e: Exception) {
        // Exception handler
    } finally {
        // This code is always executed
    }
}