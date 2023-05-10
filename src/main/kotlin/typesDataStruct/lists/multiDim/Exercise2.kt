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
    val userList: MutableList<MutableList<String>> = mutableListOf()
    for (i in 0 until gridSize) {
        val strings = readLine()!!.split(' ').toMutableList()
        userList.add(strings)
    }

    println("${userList.first()} ${userList.last()}")

    println("\n*** End of exercise ***")
}