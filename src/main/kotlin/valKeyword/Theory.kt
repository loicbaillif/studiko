package valKeyword

fun theory() {
    // https://hyperskill.org/learn/step/17408
    println("***** Theory *****")

    println("\n*** 1) val variables***")
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


    println("\n*** 2) val Variables and mutability ***")
    // Create a new val
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    // Update the previous val with another value, won't work
    println(myMutableList)
    // myMutableList = mutableListOf(1, 2, 3, 4, 5, 6) // Forbidden

    println("\n\n***** End of Theory *****")
}