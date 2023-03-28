package typesDataStruct.dataTypes.typeNumEx

fun theory() {
    println("***** Theory *****")

    println("\n1) Type coercion - examples")
    val someInt: Int = 100
    val someLong: Long = 1000
    println("\t. Value: $someInt - type: ${someInt::class.java.typeName}")
    println("\t. Value: $someLong - type: ${someLong::class.java.typeName}")
    val result1 = someInt + someLong
    print("\t. Value: $someInt + $someLong = $result1 - ")
    println("type: ${result1::class.java.typeName}")

    val someDouble: Double = 1.0
    println("\n\t. Value: $someLong - type: ${someLong::class.java.typeName}")
    println("\t. Value: $someDouble - type: ${someDouble::class.java.typeName}")
    val result2 = someLong + someDouble
    println("\t. Value: $result2 - type: ${result2::class.java.typeName}")

    println("\n\n***** End of theory *****")
}