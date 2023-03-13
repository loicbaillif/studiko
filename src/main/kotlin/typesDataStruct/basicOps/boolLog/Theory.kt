package typesDataStruct.basicOps.boolLog

fun theory() {
    // https://hyperskill.org/learn/step/4515
    println("***** Theory *****")

    println("\n1) Boolean variables")
    val someTrue = true
    val someFalse = false
    println("Two possible values:")
    println("\t. $someTrue")
    println("\t. $someFalse")

    println("\n2) Reading Boolean values")
    val someString1 = "true"
    val someString2 = "TRUE"
    val someString3 = "truE"
    val someString4 = "TrUe"
    val someString5 = "truee"
    val someString6 = "false"
    println("\t. String: $someString1 - toBoolean() => ${someString1.toBoolean()}")
    println("\t. String: $someString2 - toBoolean() => ${someString2.toBoolean()}")
    println("\t. String: $someString3 - toBoolean() => ${someString3.toBoolean()}")
    println("\t. String: $someString4 - toBoolean() => ${someString4.toBoolean()}")
    println("\t. String: $someString5 - toBoolean() => ${someString5.toBoolean()}")
    println("\t. String: $someString6 - toBoolean() => ${someString6.toBoolean()}")



    println("\n\n***** End of Theory *****")
}