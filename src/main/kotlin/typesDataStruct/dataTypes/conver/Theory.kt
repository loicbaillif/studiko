package typesDataStruct.dataTypes.conver

import kotlin.math.sqrt

fun theory() {
    // https://hyperskill.org/learn/step/4672
    println("***** Theory *****")
    println("1) Conversion between numeric types")
    val someInt1 = 169
    val someResult1: Double = sqrt(someInt1.toDouble())
    println("\t. Number: Value = $someInt1 - Type = ${someInt1::class.java.typeName}")
    print("\t. sqrt(Number): Value = $someResult1 - ")
    println(someResult1::class.java.typeName)

    val someInt2 = 321
    val someDouble2 = someInt2.toDouble()
    println("\n\t. Number: Value = $someInt2 - Type = ${someInt2::class.java.typeName}")
    print("\t. Number.toDouble(): value = $someDouble2 - ")
    println("Type = ${someDouble2::class.java.typeName}")

    val someInt3 = 125
    val someChar3: Char = someInt3.toChar()
    print("\n\t. Number: Value = $someInt3 - Type = ")
    println(someInt3::class.java.typeName)
    print("\t. Number.toChar(): Value = $someChar3 - ")
    println(someChar3::class.java.typeName)

    val someDouble4 = 32.1
    val someLong4 = someDouble4.toLong()
    print("\n\t. Number: Value = $someDouble4 - Type = ")
    println(someDouble4::class.java.typeName)
    print("\t. Number.toLong(): Value = $someLong4 - Type = ")
    println(someLong4::class.java.typeName)
    val someDouble5 = 78.9
    val someInt5 = someDouble5.toInt()
    print("\t. Number: Value = $someDouble5 - Type = ")
    println(someDouble5::class.java.typeName)
    print("\t. Number.toInt(): Value = $someInt5 - Type = ")
    println(someInt5::class.java.typeName)

    val someDouble6 = 53.1
    val someInt6 = someDouble6.toInt()
    print("\n\t. Number: Value = $someDouble6 - Type = ")
    println(someDouble6::class.java.typeName)
    print("\t. Number.toInt(): Value = $someInt6 - Type = ")
    println(someInt6::class.java.typeName)
    val someLong6 = 42L
    val someInt7 = someLong6.toInt()
    print("\n\t. Number: Value = $someLong6 - Type = ")
    println(someLong6::class.java.typeName)
    print("\t. Number.toInt(): Value = $someInt7 - Type = ")
    println(someInt7::class.java.typeName)


    println("\n\n2) Conversion to Short and Byte")
    println("Double > Short/Byte = !!! TO BE AVOIDED !!!")
    println("Float > Short/Byte = !!! TO BE AVOIDED !!!")
    val someFloat8 = 11f
    val someShort8 = someFloat8.toInt().toShort()
    print("\t. Number: Value = $someFloat8 - Type = ")
    println(someFloat8::class.java.typeName)
    print("\t. Number.toInt().toShort(): Value = $someShort8 - Type = ")
    println(someShort8::class.java.typeName)
    val someDouble9 = 97.4
    val someByte9 = someDouble9.toInt().toByte()
    print("\n\t. Number: Value = $someDouble9 - Type = ")
    println(someDouble9::class.java.typeName)
    print("\t. Number.toInt().toByte(): Value = $someByte9 - Type = ")
    println(someByte9::class.java.typeName)


    println("\n\n3) String conversion")
    val someInt10 = 33
    val someChar10 = '/'
    val someDouble10 = 33.3
    val someBoolean10 = (3 > 2)
    val someString1 = someInt10.toString()
    val someString2 = someChar10.toString()
    val someString3 = someDouble10.toString()
    val someString4 = someBoolean10.toString()
    print("\n\t. Number: Value = $someInt10 - Type = ")
    println(someInt10::class.java.typeName)
    print("\t. Number.toString: Value = $someString1 - Type = ")
    println(someString1::class.java.typeName)
    print("\n\t. Char: Value = $someChar10 - Type = ")
    println(someChar10::class.java.typeName)
    print("\t. Number.toString: Value = $someString2 - Type = ")
    println(someString2::class.java.typeName)
    print("\n\t. Double: Value = $someDouble10 - Type = ")
    println(someDouble10::class.java.typeName)
    print("\t. Number.toString: Value = $someString3 - Type = ")
    println(someString3::class.java.typeName)
    print("\n\t. Boolean: Value = $someBoolean10 - Type = ")
    println(someBoolean10::class.java.typeName)
    print("\t. Number.toString: Value = $someString4 - Type = ")
    println(someString4::class.java.typeName)


    println("\n\n4) Chain conversion example")
    val someString11 = "1000.0123456789"
    val someDouble11 = someString11.toDouble()
    val someFloat11 = someDouble11.toFloat()
    val someInt11 = someFloat11.toInt()
    val someShort11 = someInt11.toShort()
    val someChar11 = Char(someShort11.toInt())
    val someByte11 = someShort11.toByte()
    val someBoolean11 = someString11?.toBoolean()
    println("\t. String: $someString11\n\t. Double: $someDouble11")
    println("\t. Float: $someFloat11\n\t. Int: $someInt11")
    println("\t. Short: $someShort11\n\t. Char: $someChar11")
    println("\t. Byte: $someByte11\n\t. Boolean: $someBoolean11")



    println("\n\n***** End of Theory *****")
}