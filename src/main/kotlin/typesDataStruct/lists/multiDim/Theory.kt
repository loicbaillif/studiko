package typesDataStruct.lists.multiDim

/**
 * Multi-dimensional list: Theory
 * https://hyperskill.org/learn/step/15127
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Creating 2-dimensional lists")
    val mutList2D = mutableListOf(
        mutableListOf(0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0)
    )
    println(mutList2D)
    val mutList2D_2 = mutableListOf<MutableList<Int>>(
        mutableListOf(0),
        mutableListOf(1, 2),
        mutableListOf(3, 4, 5)
    )
    println(mutList2D_2)

    println("\n***** End of theory *****")
}