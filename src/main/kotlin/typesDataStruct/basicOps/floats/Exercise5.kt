package typesDataStruct.basicOps.floats

/**
 * Exercise: Uses the Double in the calculations
 * https://hyperskill.org/learn/step/4507
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Uses the Double in the calculations ***")

    // Variables
    val userInput = readln().toDouble()
    val result = ((userInput + 1) * userInput + 1) * userInput + 1  // Hörner
    println(result)

    println("\n*** End of exercise ***")
}