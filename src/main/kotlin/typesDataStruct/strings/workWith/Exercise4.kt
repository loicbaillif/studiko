package typesDataStruct.strings.workWith

/**
 * Exercise: The information about a person
 * https://hyperskill.org/learn/daily/4552
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: The information about a person ***")

    // Variable
    val inputArray = readln().split(" ") // firstName, lastName, age

    // Output
    println("${inputArray[0].first()}. ${inputArray[1]}, ${inputArray[2]} years old")

    println("\n*** End of exercise ***")
}