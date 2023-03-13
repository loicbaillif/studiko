package typesDataStruct.basicOps.boolLog

fun theory() {
    // https://hyperskill.org/learn/step/4515
    println("***** Theory *****")

    println("\n\n1) Boolean variables")
    val someTrue = true
    val someFalse = false
    println("Two possible values:")
    println("\t. $someTrue")
    println("\t. $someFalse")

    println("\n\n2) Reading Boolean values")
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

    println("\n\n3) Logical Operators")
    val boolFalse = false
    val boolTrue = true
    println("==> NOT : !")
    println("\t. !$boolFalse = ${!boolFalse}")
    println("\t. !$boolTrue = ${!boolTrue}")
    println("\n==> AND : &&")
    println("\t. $boolFalse && $boolFalse = ${boolFalse && boolFalse}")
    println("\t. $boolTrue && $boolFalse = ${boolTrue && boolFalse}")
    println("\t. $boolFalse && $boolTrue = ${boolFalse && boolTrue}")
    println("\t. $boolTrue && $boolTrue = ${boolTrue && boolTrue}")
    println("\n==> OR : ||")
    println("\t. $boolFalse || $boolFalse = ${boolFalse || boolFalse}")
    println("\t. $boolTrue || $boolFalse = ${boolTrue || boolFalse}")
    println("\t. $boolFalse || $boolTrue = ${boolFalse || boolTrue}")
    println("\t. $boolTrue || $boolTrue = ${boolTrue || boolTrue}")
    println("\n==> XOR : xor")
    println("\t. $boolFalse xor $boolFalse = ${boolFalse xor boolFalse}")
    println("\t. $boolTrue xor $boolFalse = ${boolTrue xor boolFalse}")
    println("\t. $boolFalse xor $boolTrue = ${boolFalse xor boolTrue}")
    println("\t. $boolTrue xor $boolTrue = ${boolTrue xor boolTrue}")

    println("\n\n4) Logical operator precedence")
    println("\t. true && !false = ${true && !false}")
    println("Precedence, from first to last")
    println("\t. ! (NOT)")
    println("\t. xor (XOR)")
    println("\t. && (AND)")
    println("\t. || (OR)")



    println("\n\n***** End of Theory *****")
}