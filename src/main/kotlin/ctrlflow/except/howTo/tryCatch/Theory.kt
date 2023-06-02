package ctrlflow.except.howTo.tryCatch

/**
 * Theory: The try-catch statement
 * https://hyperskill.org/learn/step/10622
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n1) *** The try-catch statement ***")
    val userInput = readln().toInt()

    println("Before the try-catch block")

    try {
        println("Inside the try block, before an exception")
        println("2 / $userInput ==> ${2/userInput}")
        println("Inside the try block, after the possible exception")
    } catch (e: ArithmeticException) {
        println("Exception: Division by zero!")
    }

    println("\n2) Getting info about exceptions")
    println("\t. Use : \"e.message\"")
    try {
        println("20 divided by $userInput ==> ${20/userInput}")
    } catch (e: ArithmeticException) {
        println("\t. ${e.message}")
    }

    println("After the try-catch block")
}