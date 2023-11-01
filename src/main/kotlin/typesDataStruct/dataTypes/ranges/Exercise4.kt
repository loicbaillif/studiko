package typesDataStruct.dataTypes.ranges

/**
 * Exercise: At least one
 * https://hyperskill.org/learn/step/20136
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: At least one ***")

    val (a, b, c, d, e) = List(5) { readln().toInt() }
    println(e in a..b || e in c..d)

    println("\n*** End of exercise ***")
}