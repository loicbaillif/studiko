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
        arrayOf(0, 0, 0, 0)
    )

    val someArray2 = arrayOf(
        arrayOf(0),
        arrayOf(1, 2),
        arrayOf(3, 4, 5)
    )

    val someArray3 = arrayOf<IntArray>() // Empty 2D-array of Int
    val someArray4 = arrayOf<Array<Int>>() // Empty 2D-array of Int


    println("\n*** 2) Accessing elements")
    val someArray5 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6)
    )

    println(someArray5[0][2]) // 3
    println(someArray5[1][0]) // 4
    println(someArray1[0][0]) // 0
    println(someArray2[2][2]) // 5
    try {
        println(someArray3[1][1])
    } catch (outBonds: ArrayIndexOutOfBoundsException) {
        println("This is out of bounds")
    }

    try {
        println(someArray4[1][1])
    } catch (outBonds: ArrayIndexOutOfBoundsException) {
        println("This is out of bounds")
    }


    println("\n*** 3) Creating 2D arrays of different types")
    val someArray6 = arrayOf(
        arrayOf("There", "is", "nothing", "either"),
        arrayOf("Good", "or", "bad", "but"),
        arrayOf("thinking", "makes", "it", "so")
    )
    for (elt in someArray6) println(elt.joinToString(", ", "\t", "..."))


    println("\n***** End of theory *****")
}