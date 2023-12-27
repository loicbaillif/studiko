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

    println("\n***** End of theory *****")
}