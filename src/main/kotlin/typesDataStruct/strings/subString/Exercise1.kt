package typesDataStruct.strings.subString

/**
 * Exercise: Case insensitive
 * https://hyperskill.org/learn/step/8543
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Case insensitive ***")

    val input1 = readln()
    val input2 = readln()
    println(input1.lowercase() == input2.lowercase())

    println("\n*** End of exercise ***")
}