package ctrlflow.ctrlStruc.ifEx

/**
 * Exercise: The max of three numbers
 * https://hyperskill.org/learn/daily/4627
 * @author JetBrains Academy
 */

fun exercise4() {
    println("*** Exercise: The max of three numbers ***")

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(if (a > c) {
        if (a > b) a else b
    } else {
        if (b > c) b else c
    })

    println("\n*** End of exercise ***")
}