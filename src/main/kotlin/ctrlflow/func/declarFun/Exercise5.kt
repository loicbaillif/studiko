package ctrlflow.func.declarFun

/**
 * Exercise: The sum of three numbers
 * https://hyperskill.org/learn/daily/4584
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: The sum of three ***")

    // Sum and output
    println(sum(readln().toInt(), readln().toInt(), readln().toInt()))

    println("\n*** End of exercise ***")
}

fun sum(n1: Int, n2: Int, n3: Int) = n1 + n2 + n3