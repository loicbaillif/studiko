package typesDataStruct.arrays.forArrays

/**
 * Exercise: Triples
 * https://hyperskill.org/learn/step/4705
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Triples ***")

    // Variables
    val arraySize = readln().toInt()
    val userArray = fillArray(arraySize)

    println(countTriples(userArray, arraySize))

    println("\n*** End of exercise ***")
}


fun countTriples(userArray: IntArray, arraySize: Int): Int {
    // Variables
    var result = 0

    // Counting loop
    for (i in 2 until arraySize) {
        if ((userArray[i] - 1 == userArray[i - 1]) && (userArray[i - 1] - 1 == userArray[i - 2])) result++
    }

    return result
}


fun fillArray(size: Int): IntArray {
    // Variable
    val userArray = IntArray(size)

    // Filling loop
    for (i in 0 until size) {
        userArray[i] = readln().toInt()
    }

    // Return array
    return userArray
}