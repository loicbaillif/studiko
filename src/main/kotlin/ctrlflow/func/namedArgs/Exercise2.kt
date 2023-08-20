package ctrlflow.func.namedArgs

import kotlin.math.hypot

/**
 * Exercise: Perimeter
 * https://hyperskill.org/learn/step/7862
 * @author JetBrains Academy
 * Solution by LoïC Baillif
 */

fun exercise2() {
    println("*** Exercise: Perimeter ***")

    // Variables
    val vertices = readln().split(" ").map { it.toInt() }.toTypedArray()
    val nbVertices = vertices.size / 2
    println(nbVertices)  // Debug
    var result = 0

    println("\n*** End of exercise ***")
}


fun getLength(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    return hypot((x2 - x1).toDouble(), (y2 - y1).toDouble())
}