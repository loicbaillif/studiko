package typesDataStruct.arrays.forArrays

/**
 * Exercise: Check the numbers
 * https://hyperskill.org/learn/daily/4700
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise6() {
    println("*** Exercise: Check the numbers ***")

    val arraySize = readln().toInt()
    val inputArray = IntArray(arraySize)

    for (i in 0 until arraySize) inputArray[i] = readln().toInt()

    val seekedInts = readln().split(" ").map { it.toInt() }

    for (i in 1 until arraySize) {

    }

    println("\n*** End of exercise ***")
}