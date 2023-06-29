package typesDataStruct.arrays.strArrays

/**
 * Exercise: Guard on the gate
 * https://hyperskill.org/learn/step/11488
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Guard on the gate ***")

    var backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()

    backFromTheWall += returnedWatchman
    println(backFromTheWall.joinToString())

    println("\n*** End of exercise ***")
}