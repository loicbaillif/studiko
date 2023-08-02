package typesDataStruct.arrays.multiDim

/**
 *
 * https://hyperskill.org/learn/step/10950
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Creating 2-D arrays")
    val someArray1 = arrayOf(
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0))

    val someArray2 = arrayOf(
        arrayOf(0),
        arrayOf(1, 2),
        arrayOf(3, 4, 5))

    val someArray3 = arrayOf<IntArray>() // Empty 2D-array of Int
    val someArray4 = arrayOf<Array<Int>>() // Empty 2D-array of Int


    println("\n*** 2) Accessing elements")



    println("\n***** End of theory *****")
}