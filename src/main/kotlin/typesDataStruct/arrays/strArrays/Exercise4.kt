package typesDataStruct.arrays.strArrays

/**
 * Exercise: Help the Lord Commander
 * https://hyperskill.org/learn/step/11487
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Help the Lord Commander ***")

    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()


    println("\n*** End of exercise ***")
}