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
    var result = 0.0

    // Calculus loop
    for (i in 0 until nbVertices) {
        result += getLength(
            vertices[i * 2],
            vertices[i * 2 + 1],
            vertices[(i * 2 + 2) % (nbVertices * 2)],
            vertices[(i * 2 + 3) % (nbVertices * 2)])
    }

    println(result)

    println("\n*** End of exercise ***")
}


fun getLength(x1: Int, y1: Int, x2: Int, y2: Int) = hypot((x2 - x1).toDouble(), (y2 - y1).toDouble())
