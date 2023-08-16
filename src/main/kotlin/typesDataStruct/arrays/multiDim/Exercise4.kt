package typesDataStruct.arrays.multiDim

/**
 * Exercise: Shapeshifter
 * https://hyperskill.org/learn/daily/10957
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Shapeshifter ***")

    //Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here

    println("\n*** End of exercise ***")
}