package typesDataStruct.dataTypes.ranges

/**
 * Exercise: Not in range
 * https://hyperskill.org/learn/step/20135
 * @author JetBrains Academy
 */

fun exercise1() {
    println("*** Exercise: Not in range ***")

    val range = 1..10
    println(readln().toInt() !in range)

    println("\n*** End of exercise ***")
}