package typesDataStruct.strings.proc

/**
 * Exercise: The lucky ticket
 * https://hyperskill.org/learn/step/9031
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: The lucky ticket ***")

    val userInput = readln()
    var firstThreeSum = 0
    for (index in userInput.indices) {
        if (index < 3) firstThreeSum += userInput[index].digitToInt()
        if (index >= 3) firstThreeSum -= userInput[index].digitToInt()
    }

    println(if (firstThreeSum == 0) "Lucky" else "Regular")

    println("\n*** End of exercise ***")
}