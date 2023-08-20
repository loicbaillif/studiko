package ctrlflow.func.namedArgs

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
    println(nbVertices)

    println("\n*** End of exercise ***")
}