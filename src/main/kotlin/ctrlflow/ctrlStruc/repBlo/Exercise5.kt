package ctrlflow.ctrlStruc.repBlo

/**
 * Exercise: Counting positive numbers
 * https://hyperskill.org/learn/step/4651
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Counting positive numbers ***")

    val nbElts = readln().toInt()
    var nbPos = 0
    for (i in 0 until nbElts) {
        if (readln().toInt() > 0) nbPos++
    }

    println("\n*** End of exercise ***")
}