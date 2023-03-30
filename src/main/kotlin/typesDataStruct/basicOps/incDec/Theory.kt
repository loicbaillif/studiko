package typesDataStruct.basicOps.incDec

fun theory() {
    // https://hyperskill.org/learn/step/10776
    println("***** Theory *****")

    println("1) Assignment Operations")
    var a = 4
    println("\t. a = $a")
    a += 3
    println("\t. a += 3 ==> $a")
    a -= 2
    println("\t. a -= 2 ==> $a")
    a *= 4
    println("\t. a *= 4 ==> $a")
    a /= 2
    println("\t. a /= 2 ==> $a")
    a %= 6
    println("\t. a %= 6 ==> $a")

    println("\n2) Using increment and decrement")
    println("\t. a = $a")
    a++
    println("\t. a++ ==> a = $a")
    a--
    println("\t. a-- ==> a = $a")

    println("\n3) Prefix form")
    println("Prefix form changes the value BEFORE variable is used")
    println("\t. a = $a")
    val b = ++a
    println("\t. b = ++a ==> b = $b - a = $a")



    println("\n\n***** End of theory *****")
}