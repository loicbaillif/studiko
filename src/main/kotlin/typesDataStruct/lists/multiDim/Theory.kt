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

    println("\n*** 2) Accessing elements")
    val mutList2D_3 = mutableListOf<MutableList<Int>>(
        mutableListOf(0, 1, 2),
        mutableListOf(3, 4, 5),
        mutableListOf(6, 7, 8)
    )
    println("[")
    for (i in 0..2) {
        print("\t[")
        for (j in 0..2) {
            print("${mutList2D_3[i][j]}\t")
            if (j != 2) print(",\t")
        }
        println("]")
    }
    println("]\n")

    println("list2D[0][2] = ${mutList2D_3[0][2]}")
    println("list2D[2][0] = ${mutList2D_3[2][0]}")
    println("list2D[1][1] = ${mutList2D_3[1][1]}")


    println("\n*** 3) Creating 2D lists of different types")
    val mutList2D_4 = mutableListOf(
        mutableListOf<String>("to", "be", "or"),
        mutableListOf<String>("not", "to", "be")
    )
    print2dStringList(mutList2D_4)


    println("\n***** End of theory *****")
}



fun print2dStringList(list1: MutableList<MutableList<String>>): Unit {
    val height = list1.size
    val width = list1[0].size
    println("height = $height - width = $width")

    println("[")
    for (i in 0 until height) {
        print("\t[\t")
        for (j in 0 until width) {
            print("${list1[i][j]}\t")
            if (j != height) print(",\t")
        }
        println("]")
    }
    println("]\n")
}