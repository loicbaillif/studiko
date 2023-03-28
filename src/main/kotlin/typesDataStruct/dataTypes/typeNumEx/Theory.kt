package typesDataStruct.dataTypes.typeNumEx

fun theory() {
    println("***** Theory *****")

    println("\n1) Type coercion - examples")
    val someInt: Int = 100
    val someLong: Long = 1000
    println("Value: $someInt - type = ${someInt::class.java.typeName}")
    println("Value: $someLong - type = ${someLong::class.java.typeName}")

    println("\n\n***** End of theory *****")
}