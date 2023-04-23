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
    println("\t. string1 = $someString1")
    println("\t. string1[0] = ${someString1[0]}")
    println("\t. string1[1] = ${someString1[1]}")
    println("\t. string1[3] = ${someString1[3]}")
    println("\t. string1[10] = ${someString1[10]}")
    println("\t. string1.length = ${someString1.length}")
    println("\t. string1[string1.length - 1] = ${someString1[someString1.length - 1]}")
    println("\t. string1.first() = ${someString1.first()}")
    println("\t. string1.last() = ${someString1.last()}")
    println("\t. string1.lastIndex = ${someString1.lastIndex}")


    println("\n***** End of theory *****")
}