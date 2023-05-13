package typesDataStruct.strings.subString

/**
 * Getting substrings: Theory
 * https://hyperskill.org/learn/step/8535
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Getting a part of a string")
    val someString1 = "Hello"
    println("\t. someString1.substring(0, 1) ==> ${someString1.substring(0, 1)}")
    println("\t. someString1.substring(0, 3) ==> ${someString1.substring(0, 3)}")
    println("\t. someString1.substring(1, 3) ==> ${someString1.substring(1, 3)}")
    println("\t. someString1.substring(1) ==> ${someString1.substring(1)}")
    println("\t. someString1.substring(3, 5) ==> ${someString1.substring(3, 5)}")

    println("\n***** End of theory *****")
}