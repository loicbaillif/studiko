package typesDataStruct.lists.multiDim

/**
 * Exercise: Cube of zeros
 * https://hyperskill.org/learn/step/15135
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Cube of zeros ***")

    val mutListZero = mutableListOf<Int>(0, 0, 0)
    val cubeOfZeros = mutableListOf(
        mutableListOf(mutListZero, mutListZero, mutListZero),
        mutableListOf(mutListZero, mutListZero, mutListZero),
        mutableListOf(mutListZero, mutListZero, mutListZero)
        )

    println(cubeOfZeros)

    println("\n*** End of exercise ***")
}