package typesDataStruct.variab.equality

fun theory() {
    // https://hyperskill.org/learn/step/11236
    println("***** Theory *****")

    println("\n*** 1) Comparison")
    val someString1 = "Hello"
    val someString2 = "Hello"
    println("\"Hello\" == \"Hello\" ==> ${someString1 == someString2}")

    println("\n*** 2) Base types and equality")
    var someInt1: Int = 100
    val someInt2: Int = someInt1
    println("\tsomeInt1 == someInt2 ==> ${someInt1 == someInt2}")
    println("\tsomeInt1 === someInt2 ==> ${someInt1 === someInt2}")
    someInt1 = 200
    println("\tsomeInt1 = 200")
    println("\tsomeInt1 == someInt2 ==> ${someInt1 == someInt2}")
    println("\tsomeInt1 === someInt2 ==> ${someInt1 === someInt2}")
    val someList1: MutableList<Int> = mutableListOf()
    val someList2: MutableList<Int> = someList1
    someList1.add(5)
    println("\t. list2 = list1")
    println("\t. list1 = $someList1")
    println("\t. list2 = $someList2")


    println("\n***** End of theory *****")
}