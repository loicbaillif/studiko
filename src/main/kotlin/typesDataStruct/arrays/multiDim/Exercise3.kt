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

    println("${inputArray[0][0]} ${inputArray[0].last()}\n${inputArray.last()[0]} ${inputArray.last().last()}")


    println("\n*** End of exercise ***")
}