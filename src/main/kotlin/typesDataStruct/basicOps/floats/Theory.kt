package typesDataStruct.basicOps.floats

import java.util.Locale

/**
 * Theory: Floating-point types
 * https://hyperskill.org/learn/step/4502
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Floating-point arithmetic operations")
    val someDouble1 = 1.0
    val someDouble2 = -3.21
    val pi = 3.14159
    println("Double: ")
    println("\t. value = $someDouble1 - type = ${someDouble1::class.simpleName}")
    println("\t. value = $someDouble2 - type = ${someDouble2::class.simpleName}")
    println("\t. value = $pi - type = ${pi::class.simpleName}")

    println("Floats:")
    val someFloat1: Float = 1f
    val someFloat2 = 7.89f
    println("\t. value = $someFloat1 - type = ${someFloat1::class.simpleName}")
    println("\t. value = $someFloat2 - type = ${someFloat2::class.simpleName}")

    println("Calculus on Doubles")
    print("\t. $someDouble1 + $someDouble2 = ${someDouble1 + someDouble2} - ")
    println(" type = ${(someDouble1 + someDouble2)::class.simpleName}")
    print("\t. $someDouble1 * $someDouble2 = ${someDouble1 * someDouble2} - ")
    println(" type = ${(someDouble1 * someDouble2)::class.simpleName}")
    print("\t. $someDouble2 / 2 = ${someDouble2 / 2} - ")
    println(" type = ${(someDouble1 / 2)::class.simpleName}")


    println("\n*** 2) Errors during computation")
    println("\t. 3.3 / 3 = ${3.3 / 3}")
    print("\t. 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = ")
    println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1)


    println("\n*** 3) Reading numbers")
    val someDouble3 = readln().toDouble()
    val someFloat3 = readln().toFloat()
    println("\t. value = $someDouble3 - type = ${someDouble3::class.simpleName}")
    println("\t. value = $someFloat3 - type = ${someFloat3::class.simpleName}")


    println("\n*** 4) Decimal Separator")
    val someFloat4 = readln().format(Locale.US).toFloat() // To adapt to US decimal
    println("\t. value = $someFloat4 - type = ${someFloat4::class.simpleName}")


    println("\n***** End of Theory *****")
}