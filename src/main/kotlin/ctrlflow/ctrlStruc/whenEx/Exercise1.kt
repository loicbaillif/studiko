package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: Direction
 * https://hyperskill.org/learn/step/4604
 * @author JetBrains Academy
 * Solution by Loîc Baillif
 */

fun exercise1() {
    println("*** Exercise: Direction ***")

    val userInput = readln()
    println(when (userInput) {
        else -> "error!"
    })

    println("\n*** End of exercise ***")
}