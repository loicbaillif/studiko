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

    val someLong1 = 1_000_000_000_000_000
    val someLong2: Long = 1_000_000
    val someLong3 = 1000L
    val result4 = someLong1 - someLong2
    val result5 = result4 / someLong3
    println("\nSome calculus with long:")
    println("\t. $someLong1 - $someLong2 = $result4")
    println("\t. $result4 / $someLong3 = $result5")

    println("\n\n2) Reading numbers from standard input")
    // val someInt4 = readln().toInt()
    // val someLong4 = readln().toLong()
    val someInt4 = 13
    val someLong4 = 24L
    println("\t. 1st value read: $someInt4 - type = ${someInt4::class.java.typeName}")
    println("\t. 2nd value read: $someLong4 - type = ${someLong4::class.java.typeName}")

    println("\n\n3) Unsigned integers")
    val someUByte1 : UByte = 123U
    println("\t. UByte: \n\t\t. Max Value = ${UByte.MAX_VALUE}")
    println("\t\t. Type = ${someUByte1::class.java.typeName}")
    println("\t\t. Declaration: val c: UByte = 123U")

    println("\t. UShort: \n\t\t. Max Value = ${UShort.MAX_VALUE}")
    println("\t\t. Type = ${UShort::class.java.typeName}")
    println("\t\t. Declaration: val c: UShort = 123u")

    println("\t. UInt: \n\t\t. Max Value = ${UInt.MAX_VALUE}")
    println("\t\t. Type = ${UInt::class.java.typeName}")
    println("\t\t. Declaration: val c = 123u // postfix u ==> UInt by default")



    println("\n\n***** End of theory *****")
}