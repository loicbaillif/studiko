package ctrlflow.func.declarFun

/**
 * Declaring Function - Theory
 * https://hyperskill.org/learn/step/4580
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n1) Basic Syntax")
    println("""
        fun myFunction(param1: Type1, param2: Type2, ...): ReturnType {
            // body
            return result
        }
    """.trimIndent())

    println("\n2) First example")
    val someInt1 = 33
    val someInt2 = 17
    println("sumOfTwo($someInt1, $someInt2) = ${sumOfTwo(someInt1, someInt2)}")

    println("\n3) Return type")
    println("If a function returns nothing, 2 possibilities to declare it:")
    println("\t. Omit the return declaration in its body")
    println("\t. Specify the special 'Unit' type as the return type")


    println("\n***** End of theory *****")
}

fun sumOfTwo(a: Int, b: Int): Int {
    return a + b
}