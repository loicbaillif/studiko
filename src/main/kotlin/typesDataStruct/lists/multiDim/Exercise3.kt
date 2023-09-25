package typesDataStruct.lists.multiDim

/**
 * Exercise: Cube of zeros
 * https://hyperskill.org/learn/step/15135
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Cube of zeros ***")

    val mulListZero = mutableListOf<Int>(0, 0, 0)
    val cubeOfZeros = mutableListOf(
        mutableListOf(mulListZero, mulListZero, mulListZero),
        mutableListOf(mulListZero, mulListZero, mulListZero),
        mutableListOf(mulListZero, mulListZero, mulListZero)
        )

    println(cubeOfZeros.joinToString())

    println("\n*** End of exercise ***")
}