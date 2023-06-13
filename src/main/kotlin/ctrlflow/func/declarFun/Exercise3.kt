package ctrlflow.func.declarFun

/**
 * Exercise: Division
 * https://hyperskill.org/learn/daily/4588
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Division ***")

    val n1 = readln().toLong()
    val n2 = readln().toLong()
    println(divide(n1, n2))

    println("\n*** End of exercise ***")
}


fun divide(a: Long, b: Long) : Double {
    return (a.toDouble() / b)
}