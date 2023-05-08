package typesDataStruct.lists.forLoop

/**
 * Exercise: The index of the first max
 * https://hyperskill.org/learn/step/15024
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: The index of the first max ***")

    val nbInputs = readln().toInt()
    val listInputs = mutableListOf<Int>()
    var max = 0
    var indexMax = 0

    for (index in 0 until nbInputs) {
        listInputs.add(readln().toInt())
        if (listInputs[index] > max) {
            max = listInputs[index]
            indexMax = index
        }
    }

    println("\n*** End of exercise ***")
}