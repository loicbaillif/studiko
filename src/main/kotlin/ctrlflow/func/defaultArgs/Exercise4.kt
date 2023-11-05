package ctrlflow.func.defaultArgs

/**
 * Exercise: Summation
 * https://hyperskill.org/learn/daily/7856
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Summation ***")

    println(sum5(readln().toInt(), readln().toInt()))

    println("\n*** End of exercise ***")
}


fun sum5(a1: Int, a2: Int, a3: Int = 0, a4: Int = 0, a5: Int = 0): Int = a1 + a2 + a3 + a4 + a5
