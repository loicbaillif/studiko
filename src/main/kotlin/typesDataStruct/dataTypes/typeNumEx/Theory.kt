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

    println("\n2) Short and Byte types")
    println("Result of the calculation involving Byte or Short will ")
    println("be converted to Int")
    val someByte1: Byte = 3
    val someByte2: Byte = 6
    val result3 = someByte1 + someByte2
    println("\t. Value: $someByte1 - type: ${someByte1::class.java.typeName}")
    println("\t. Value: $someByte2 - type: ${someByte2::class.java.typeName}")
    print("\t. Value: $someByte1 + $someByte2 = $result3 - ")
    println("type: ${result3::class.java.typeName}")


    println("\n\n***** End of theory *****")
}