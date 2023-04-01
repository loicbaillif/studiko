package typesDataStruct.basicOps.relOps

fun theory() {
    // https://hyperskill.org/learn/step/4525
    println("***** Theory *****")

    println("\n1) List of relational operators")
    println("\t. == \t To check equality")
    println("\t. != \t To check non-equality")
    println("\t. > \t To check strictly greater than")
    println("\t. < \t To check strictly lower than")
    println("\t. >= \t To check greater than or equal")
    println("\t. <= \t To check lower than or equal")
    println("It always result in a Boolean value")

    println("\n2) Examples with int numbers")
    val someInt1 = 1
    val someInt2 = 2
    val someLong1 = 1L
    val someLong2 = 2L
    print("\t. $someInt1 (${someInt1::class.java.typeName}) < ")
    print("$someInt2 (${someInt2::class.java.typeName}) ==> ")
    println(someInt1 < someInt2)
    print("\t. $someInt1 (${someInt1::class.java.typeName}) <= ")
    print("$someLong1 (${someLong1::class.java.typeName}) ==> ")
    println(someInt1 <= someLong1)
    print("\t. $someLong1 (${someLong1::class.java.typeName}) > ")
    print("$someLong2 (${someLong2::class.java.typeName}) ==> ")
    println(someLong1 > someLong2)
    print("\t. $someLong1 (${someLong1::class.java.typeName}) >= ")
    print("$someLong2 (${someLong2::class.java.typeName}) ==> ")
    println(someLong1 >= someLong2)
    print("\t. $someInt1 (${someInt1::class.java.typeName}) == ")
    print("$someLong1 (${someLong1::class.java.typeName}) ==> ")
    println("ERROR: Operator '==' cannot be applied to 'Int' and 'Long'")

    println("\n3) Joining relational operations")
    println("Kotlin cannot assess something such as : a < b < c")
    println("This shall be assessed as : a < b && b < c")

    println("\n\n***** End of theory *****")
}