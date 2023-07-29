package typesDataStruct.arrays.forArrays

/**
 * Exercise: Counting
 * https://hyperskill.org/learn/step/4695
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Counting ***")

    // Variables
    val nbElts = readln().toInt()
    val elts = IntArray(nbElts)

    for (i in 0 until nbElts) {
        elts[i] = readln().toInt()
    }


    println("\n*** End of exercise ***")
}