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
    println("someInt1 = someInt2 ==> ${someInt1 == someInt2}")


    println("\n***** End of theory *****")
}