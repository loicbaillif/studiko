package typesDataStruct.lists.introMut

fun theory() {
    // https://hyperskill.org/learn/step/14879
    println("***** Theory *****")

    println("\n1) Introduction to MutableList")
    println("First declaration:")
    val numbersList = mutableListOf(12.3, 45.6, 7.8, 90)
    println(numbersList)

    println("\n2) Creating a MutableList with specified elements")
    // Declaring a mutable list of integers
    val mutableList1 = mutableListOf<Int>(1, 3, 5, 7, 9)
    println(mutableList1)
    // Declaring a mutable list of strings
    val mutableList2 = mutableListOf<String>("Alpha", "Bravo", "Charlie")
    println(mutableList2)
    // Declaring an empty mutable list of booleans
    val mutableList3 = mutableListOf<Boolean>()
    println(mutableList3)

    println("\n3) MutableList size")
    val mutableList4 = MutableList(5) {42}
    println("\n. $mutableList4")
    val mutableList5 = MutableList(5) {"to"}
    println("\n. $mutableList5")
    println("\n. ml: $mutableList2 - ml.size : ${mutableList2.size}")

    println("\n4) Reading list from input")
    // val mutableList6 = MutableList(4) { readln().toInt() }
    // println("\n. $mutableList6")
    // val mutableList7 = readln().split(" ").map { it.toInt() }.toMutableList()
    // println("\n. $mutableList7")
    val regex1 = "\\s+".toRegex()
    val inputString1 = "9\n\n8   7  \t\t6  \n\t5 4"
    val mutableList8 = inputString1.split(regex1).map { it.toInt() }.toMutableList()
    println("\n. Input = $inputString1")
    println("\n. Mapping to MutableList: $mutableList8")

    println("\n5) Accessing elements")
    println("\t. ml1 = $mutableList1 ...")
    mutableList1[1] = 6
    println("\t... ml1[1] = 6 ...\n\t... ml1 = $mutableList1")
    println("\n\t. ml1[3] = ${mutableList1[3]}")
    val mutableList9 = mutableListOf<Int>(0, 0, 0)
    mutableList9[0] = 7
    mutableList9[1] = 3
    mutableList9[2] = mutableList9[0] + mutableList9[1]
    println(mutableList9)
    val mutableList10 = mutableListOf<String>("Alpha", "Bravo", "Charlie", "Delta", "Echo")
    println("\t. ml2 = $mutableList10")
    println("\t. ml2.size = ${mutableList10.size}")
    println("\t. ml2[ml2.size - 1] = ${mutableList10[mutableList10.size - 1]}")
    println("\t. ml2.first() = ${mutableList10.first()}")
    println("\t. ml2.last() = ${mutableList10.last()}")
    println("\t. ml2.lastIndex = ${mutableList10.lastIndex}")



    println("\n\n***** End of theory *****")
}