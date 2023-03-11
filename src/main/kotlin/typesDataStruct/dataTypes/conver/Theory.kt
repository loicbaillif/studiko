package typesDataStruct.dataTypes.conver

import kotlin.math.sqrt

fun theory() {
    // https://hyperskill.org/learn/step/4672
    println("***** Theory *****")
    println("1) Conversion between numeric types")
    val someInt1: Int = 169
    val someResult1: Double = sqrt(someInt1.toDouble())
    println("\t. Number: Value = $someInt1 - Type = ${someInt1::class.java.typeName}")
    print("\t. sqrt(Number): Value = $someResult1 - ")
    println(someResult1::class.java.typeName)

    val someInt2 = 321
    val someDouble2 = someInt2.toDouble()
    println("\n\t. Number: value = $someInt2 - Type = ${someInt2::class.java.typeName}")
    print("\t. Number.toDouble(): value = $someDouble2 - ")
    println("Type = ${someDouble2::class.java.typeName}")

    val someInt3: Int = 125
    val someChar3: Char = someInt3.toChar()
    print("\n\t. Number: value = $someInt3 - Type = ")
    println(someInt3::class.java.typeName)
    print("\t. Number.toChar(): Value = $someChar3 - ")
    println(someChar3::class.java.typeName)



    println("\n\n***** End of Theory *****")
}