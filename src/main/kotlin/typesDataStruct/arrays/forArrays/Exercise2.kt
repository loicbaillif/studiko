package typesDataStruct.arrays.forArrays

/**
 * Exercise: Right Rotation
 * https://hyperskill.org/learn/step/4698
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Right Rotation ***")



    println("\n*** End of exercise ***")
}


fun createArray(arraySize: Int): IntArray {
    // Variable
    val resultArray = IntArray(arraySize)

    for (i in 0 until arraySize) {

    }
}


fun rotateRight(input: IntArray) {
    // Temp variable
    val lastItem = input.last()

    // Rotation template
    for (i in input.lastIndex - 1 downTo 0) {
        input[i + 1] = input[i]
    }

    // Insert last at first position
    input[0] = lastItem
}