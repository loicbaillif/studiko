package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: String processor
 * https://hyperskill.org/learn/daily/4603
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise6() {
    println("*** Exercise: String processor ***")

    val userInput1 = readln()
    val operator = readln()
    val userInput2 = readln()

    when (operator) {
        "endsWith" -> println(userInput1.endsWith(userInput2))
        "equals" -> println(userInput1 == userInput2)
        "plus" -> println(userInput1 + userInput2)
    }

    println("\n*** End of exercise ***")
}