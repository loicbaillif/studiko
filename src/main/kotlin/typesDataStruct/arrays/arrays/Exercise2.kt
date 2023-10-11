package typesDataStruct.arrays.arrays

import kotlin.math.pow

/**
 * Exercise: Initializing an array
 * https://hyperskill.org/learn/step/7866
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Initializing an array ***")

    val numberArray1 = IntArray(100)
    val ten = 10.0
    repeat(3) {
        numberArray1[ten.pow(it).toInt() - 1] = ten.pow(it).toInt()
    }

    println(numberArray1.joinToString("\n"))

    println("\n*** End of exercise ***")
}