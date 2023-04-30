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



    println("\n***** End of theory *****")
}

fun sumOfTwo(a: Int, b: Int): Int {
    return a + b
}