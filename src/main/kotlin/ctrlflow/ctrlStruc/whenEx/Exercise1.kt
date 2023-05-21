package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: Direction
 * https://hyperskill.org/learn/step/4604
 * @author JetBrains Academy
 * Solution by Loîc Baillif
 */

fun exercise1() {
    println("*** Exercise: Direction ***")

    println(when (readln()) {
        "0" -> "do not move"
        "1" -> "move up"
        "2" -> "move down"
        "3" -> "move left"
        "4" -> "move right"
        else -> "error!"
    })

    println("\n*** End of exercise ***")
}