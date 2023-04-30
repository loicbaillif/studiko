package ctrlflow.ctrlStruc.forRanges

/**
 * https://hyperskill.org/learn/step/4656
 * Exercise: The roots of equation
 * @author JetBrains Academy - implementation by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: The roots of equation ***")
    // Equation = a*x^3 + b*x^2 + c*x + d

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in 0L..1000L) {
        val result = ((a * x + b) * x + c) * x + d
        if (result == 0L) println(x)
    }

    println("\n*** End of exercise ***")
}