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

    println("\n\n***** End of theory *****")
}