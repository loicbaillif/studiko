package ctrlflow.ctrlStruc.forRanges

/**
 * Exercise: The longest sequence
 * https://hyperskill.org/learn/step/4702
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: The longest sequence ***")

    val nbElts = readln().toInt()
    var previousElt: Int
    var currentElt = 0
    var currentSequence = 0
    var longestSequence = 0

    for (elt in 1..nbElts) {
        previousElt = currentElt
        currentElt = readln().toInt()
    }

    println("\n*** End of exercise ***")
}