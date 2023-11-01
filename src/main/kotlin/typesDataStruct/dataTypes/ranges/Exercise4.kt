package typesDataStruct.dataTypes.ranges

/**
 * Exercise: At least one
 * https://hyperskill.org/learn/step/20136
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: At least one ***")

    val fromRange1 = readln().toInt()
    val toRange1 = readln().toInt()
    val fromRange2 = readln().toInt()
    val toRange2 = readln().toInt()
    val userNumber = readln().toInt()
    println(userNumber in fromRange1..toRange1 || userNumber in fromRange2..toRange2)

    println("\n*** End of exercise ***")
}