package addit.errorless.simple

/**
 * Exercise: Cycles and iterations
 * https://hyperskill.org/learn/step/15510
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Cycles and iterations ***")

    var prev = 0
    var current = 1
    for (i in 0..24) {
        val swap = prev
        prev = current
        current += swap
        println(current)
    }

    println("\n*** End of exercise ***")
}