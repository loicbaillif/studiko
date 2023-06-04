package typesDataStruct.basicOps.floats

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


    println("\n***** End of Theory *****")
}