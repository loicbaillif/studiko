package valKeyword

const val MY_STRING = "I am a constant String"
const val PI_FIVE = 3.14159
const val SOME_INT = 99
const val FIRST_LETTER = 'A'

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
    myMutableList.add(6)
    println(myMutableList)

    println("\n*** 3) const Variables")
    println("must be declared out of function")
    println("const var is known at compile time")
    println(PI_FIVE)
    println(MY_STRING)
    println("const can only be used for primary type variable")
    println(SOME_INT)
    println(FIRST_LETTER)


    println("\n\n***** End of Theory *****")
}