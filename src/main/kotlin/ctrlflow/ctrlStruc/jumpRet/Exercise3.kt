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
    val occupiedRows = arrayOf<Int>(ship1[0].toInt(), ship2[0].toInt(), ship3[0].toInt())
    val occupiedCols = arrayOf<Int>(ship1[1].toInt(), ship2[1].toInt(), ship3[1].toInt())
    var first = true

    for (elt in 1..5) {
        if (occupiedRows.indexOf(elt) == -1) {
            if (!first) print(" ")
            print(elt)
            first = false
        }
    }
    println()
    first = true

    for (elt in 1..5) {
        if (occupiedCols.indexOf(elt) == -1) {
            print("$elt ")
        }
    }
    println()


    println("\n*** End of exercise ***")
}