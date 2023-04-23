package typesDataStruct.strings.workWith

/**
 * https://hyperskill.org/learn/step/12561
 * Working with Strings - Theory
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n1) Accessing characters")
    val someString1 = "Welcome to Kotlin"
    println("string1 = $someString1")
    println("string1[0] = ${someString1[0]}")
    println("string1[1] = ${someString1[1]}")
    println("string1[3] = ${someString1[3]}")
    println("string1[10] = ${someString1[10]}")
    println("string1.length = ${someString1.length}")
    println("string1[string1.length - 1] = ${someString1[someString1.length - 1]}")


    println("\n***** End of theory *****")
}