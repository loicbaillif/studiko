package typesDataStruct.lists.multiDim

/**
 * Exercise: Corners
 * https://hyperskill.org/learn/step/15136
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Corners ***")

    val gridSize = readln().toInt()
    val userList: MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 until gridSize) {
        for (j in 0 until gridSize) {
            userList[i][j] = readln().toInt()
        }
    }

    println("\n*** End of exercise ***")
}