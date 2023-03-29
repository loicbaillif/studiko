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
    println("Example with bytes:")
    val someByte1: Byte = 3
    val someByte2: Byte = 6
    val result3 = someByte1 + someByte2
    println("\t. Value: $someByte1 - type: ${someByte1::class.java.typeName}")
    println("\t. Value: $someByte2 - type: ${someByte2::class.java.typeName}")
    print("\t. Value: $someByte1 + $someByte2 = $result3 - ")
    println("type: ${result3::class.java.typeName}")
    println("Example with shorts")
    val someShort1: Short = 4
    val someShort2: Short = 8
    val result4 = someShort1 + someShort2
    println("\t. Value: $someShort1 - type: ${someShort1::class.java.typeName}")
    println("\t. Value: $someShort2 - type: ${someShort2::class.java.typeName}")
    print("\t. Value: $someShort1 + $someShort2 = $result4 - ")
    println("type: ${result4::class.java.typeName}")
    println("Force result to byte or short")
    val result5 = (someByte1 + someByte2).toByte()
    val result6 = (someShort1 + someShort2).toShort()
    print("\t. Value: ($someByte1 + $someByte2).toByte() = $result5 - ")
    println("type: ${result5::class.java.typeName}")
    print("\t. Value: ($someShort1 + $someShort2).toShort() = $result6 - ")
    println("type: ${result6::class.java.typeName}")

    println("\n3) Conclusion")
    println("\t. If either operand is Double, the result is Double")
    println("\t. Else if either operand is Float, the result is Float")
    println("\t. Else if either operand is Long, the result is Long")
    println("\t. Otherwise the result is Int")



    println("\n\n***** End of theory *****")
}