package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: From String to a number
 * https://hyperskill.org/learn/step/4600
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise7() {
    println("*** Exercise: From String to a number ***")

    println(when (readln()) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> 0
    })

    println("\n*** End of exercise ***")
}