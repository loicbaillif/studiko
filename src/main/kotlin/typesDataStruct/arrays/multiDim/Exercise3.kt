package typesDataStruct.arrays.multiDim

/**
 * Exercise: Corners
 * https://hyperskill.org/learn/step/10956
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Corners ***")

    // Variables
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toTypedArray()
        inputArray += strings
    }


    println("\n*** End of exercise ***")
}