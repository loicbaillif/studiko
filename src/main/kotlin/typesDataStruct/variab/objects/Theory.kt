package typesDataStruct.variab.objects

fun theory() {
    // https://hyperskill.org/learn/step/11233
    println("***** Theory *****")

    println("\n1) State and Behaviour")
    val someString1 = "Hi"
    // Object property example
    println("\t. myString: $someString1")
    println("\t. myString.length = ${someString1.length}")
    // Object method example
    println("\n\t. myString: $someString1")
    println("\t. myString.repeat(3) = ${someString1.repeat(3)}")

    println("\n2) Copying by reference")
    val someString2 = "Bingo"
    val someString3 = someString2
    println("\t. msg1 = $someString2")
    println("\t. msg2 = msg1 ==> msg2 = $someString3")

    println("\n3) Mutability")
    var someInt1 = 100
    val someInt2 = someInt1
    println("\t. myInt = $someInt1")
    println("\t. myInt2 = myInt")
    println("\t. myInt == myInt2 : ${someInt1 == someInt2}")
    println("\t. myInt === myInt2 : ${someInt1 === someInt2}")




    println("\n\n***** End of Theory *****")
}