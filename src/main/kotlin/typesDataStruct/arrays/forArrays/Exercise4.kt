package typesDataStruct.arrays.forArrays

/**
 * Exercise: Is it here?
 * https://hyperskill.org/learn/step/4696
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Is it here? ***")

    // Variables
    val arraySize = readln().toInt()

    println("\n*** End of exercise ***")
}


fun initArray(size: Int): IntArray {
    // Variables
    val userArray = IntArray(size)

    // Filling loop
    for (i in 0 until size) {
        userArray[i] = readln().toInt()
    }

    return userArray
}


fun isItThere(userArray: IntArray, elt: Int) {
    if (userArray.indexOf(elt) == -1) {
        println("NO")
    } else {
        println("YES")
    }
}