package ctrlflow.except.howTo.tame

/**
 * Exercise: Too big for us
 * https://hyperskill.org/learn/step/18772
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Too big for us ***")

    val userInput = readln().toInt()
    val exceptionLimit = 0 // Exception if higher than this value

    if (userInput > exceptionLimit) throw Exception("It's too big") else println(userInput)

    println("\n*** End of exercise ***")
}