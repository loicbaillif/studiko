package ctrlflow.ctrlStruc.jumpRet

/**
 * Exercise: Placement of ships
 * https://hyperskill.org/learn/daily/6172
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Placement of ships ***")

    // Ships
    val ship1 = readln().split(" ")
    val ship2 = readln().split(" ")
    val ship3 = readln().split(" ")

    // Variables
    val occupiedRows = arrayOf(ship1[0], ship2[0], ship3[0])
    val occupiedCols = arrayOf(ship1[1], ship2[1], ship3[1])


    println("\n*** End of exercise ***")
}