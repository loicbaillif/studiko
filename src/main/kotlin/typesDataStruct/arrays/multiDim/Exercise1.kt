package typesDataStruct.arrays.multiDim

/**
 * Exercise: Kotlin arrays
 * https://hyperskill.org/learn/step/10955
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Kotlin Arrays ***")

    // Initialize input array
    val inputArray = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9),
        arrayOf(10, 11, 12)
    )

    println(inputArray[2].joinToString())

    println("\n*** End of exercise ***")
}