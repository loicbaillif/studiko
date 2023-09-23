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

    // First index case
    if (inputArray[0] == seekedInts[0] && inputArray[1] == seekedInts[1]) {
        println("NO")
        return
    }

    for (i in 1 until arraySize) {
        if (inputArray[i] == seekedInts[i]) {
            if (inputArray[i - 1] == seekedInts[1] || inputArray[i + 1] == seekedInts[1]) {
                println("NO")
                return
            }
        }
    }

    println("YES")

    println("\n*** End of exercise ***")
}