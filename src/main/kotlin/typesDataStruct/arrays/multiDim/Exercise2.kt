package typesDataStruct.arrays.multiDim

/**
 * Exercise: Accordance
 * https://hyperskill.org/learn/step/10956
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Accordance ***")

    // Variable
    val nbRows = 2
    val nbCols = 3
    val exArray = Array(nbRows) { i->
        Array(nbCols) { j ->
            "[$i][$j]"
        }
    }

    // Printing
    println(exArray.contentDeepToString())

    println("\n*** End of exercise ***")
}