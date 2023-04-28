package ctrlflow.ctrlStruc.forRanges

/**
 * Exercise: The sum of integers from a to b
 * https://hyperskill.org/learn/step/4654
 * @author: JetBrains Academy
 */

fun exercise1() {
    println("*** Exercise: The sum of integers from a to b ***")

    val a = readln().toInt()
    val b = readln().toInt()
    var result = 0
    for (i in a..b) {
        result += i
    }

    println(result)

    println("\n*** End of exercise ***")
}