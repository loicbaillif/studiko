package typesDataStruct.basicOps.intAction

fun theory() {
    // https://hyperskill.org/learn/step/4488
    println("***** Theory *****")

    println("\n1) Int and long integer types")
    val someInt1 = 3
    val someInt2 = 7
    val result1 = someInt1 + someInt2
    val result2 = result1 * someInt1
    val result3 = result2 % someInt2
    println("\nSome calculus with integers:")
    println("\t. $someInt1 + $someInt2 = $result1")
    println("\t. $result1 * $someInt1 = $result2")
    println("\t. $result2 / $someInt2 = $result3")



    println("\n\n***** End of theory *****")
}