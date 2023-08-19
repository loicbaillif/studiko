package typesDataStruct.strings.workWith

/**
 * Exercise: Name Card
 * https://hyperskill.org/learn/step/12566
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise6() {
    println("*** Exercise: Name Card ***")

    // Variables
    val firstName = readln()
    val lastName = readln()

    // Output
    val result = firstName.first() + ". " + lastName
    println(result)

    println("\n*** End of exercise ***")
}