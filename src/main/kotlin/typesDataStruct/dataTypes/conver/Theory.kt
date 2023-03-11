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



    println("\n\n***** End of Theory *****")
}