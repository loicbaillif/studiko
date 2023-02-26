package valKeyword

fun theory() {
    // https://hyperskill.org/learn/step/17408
    println("***** Theory *****")

    println("*** val variables***")
    val pi = 3.1415
    val greetingsMsg = "Hello and Welcome"
    println(pi)
    println(greetingsMsg)
    // pi = 3.14159 // val cannot be reassigned

    val boolFalse: Boolean
    val someInt: Int
    val anyFloat: Float
    // println(boolFalse) // Must be initialized first
    boolFalse = false
    someInt = 42
    anyFloat = 13.579f
    println(boolFalse)
    println(someInt)
    println(anyFloat)

    println("***** End of Theory *****")
}