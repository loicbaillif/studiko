package typesDataStruct.dataTypes.typeSystem

/**
 * Theory: Type system
 * https://hyperskill.org/learn/step/9689
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Static Typing")
    val message: String = "Hello, Kotlin!"

    println("\n*** 2) Null Safety")
    var a: String = "Ping"
    var b: String? = "Pong"
    println("\ta = $a\tb = $b")
    // a = null // Error
    b = null // No error
    println("\ta = null ==> error\tb = null ==>  $b")

    println("\n*** 3) Smart casts")
    if (a is String) println(a.length) // Automatic typecasting

    println("\n*** 4) Type inference")
    val c = "Kotlin"
    println("\t c = $c ==>\t c is ${c::class.java.simpleName} (automatic)")

    println("\n*** 5) Extension function")
    fun String.addExclamation() = this + "!"
    println("\ttest".addExclamation())

    println("\n*** 6) Basic Types in Kotlin")
    println("\t. Int: 32-bit signed integer")
    println("\t. Double: 64-bit double-precision floating-point number")
    println("\t. Char: Single 16-bit Unicode character, enclosed in single quotes")
    println("\t. Boolean: truth value, either true or false")


    println("\n***** End of theory *****")
}