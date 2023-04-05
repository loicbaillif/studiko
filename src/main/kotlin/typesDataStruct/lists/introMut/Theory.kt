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


    println("\n\n***** End of theory *****")
}