package typesDataStruct.lists.multiDim

/**
 * Exercise: Kotlin lists
 * https://hyperskill.org/learn/step/15132
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Kotlin lists ***")

    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val stringsList = readLine()!!.split(' ').toMutableList()
        inputList.add(stringsList)
    }
    // Do not change lines above
    // Write your code here
    println(inputList[2].joinToString(", "))

    println("\n*** End of exercise ***")
}