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
    val exArray = arrayOf( arrayOf<String>("", "", ""), arrayOf<String>("", "", "") )

    // Filling
    for (i in 0..1) {
        for (j in 0..2) exArray[i][j] = "[$i][$j]"
    }

    // Printing
    println(exArray.contentDeepToString())

    println("\n*** End of exercise ***")
}