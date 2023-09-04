package typesDataStruct.arrays.forArrays

/**
 * Exercise: Find the max
 * https://hyperskill.org/learn/step/4703
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Find the max ***")

    val nbElts = readln().toInt()
    val userArray = IntArray(nbElts)

    userArray[0] = readln().toInt()
    var max = userArray[0] // max initiated by first element's value
    var maxIndex = 0

    // Fill array
    for (i in 1 until nbElts) {
        userArray[i] = readln().toInt()
        if (userArray[i] > max) {
            max = userArray[i]
            maxIndex = i
        }
    }

    // Result
    println(maxIndex)

    println("\n*** End of exercise ***")
}