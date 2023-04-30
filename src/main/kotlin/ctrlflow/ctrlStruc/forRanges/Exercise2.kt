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
    var result: Long = 0L

    for (x in 0L..1000L) {
        result = a * x * x * x + b * x * x + c * x + d
        if (result == 0L) println(x)
    }

    println("\n*** End of exercise ***")
}