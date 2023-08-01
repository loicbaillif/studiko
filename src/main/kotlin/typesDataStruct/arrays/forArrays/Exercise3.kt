package typesDataStruct.arrays.forArrays

/**
 * Exercise: Triples
 * https://hyperskill.org/learn/step/4705
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Triples ***")



    println("\n*** End of exercise ***")
}


fun fillArray(size: Int): IntArray {
    // Variable
    val userArray = IntArray(size)

    // Filling loop
    for (i in 0 until size) {
        userArray[i] = readln().toInt()
    }

    // Return array
    return userArray
}