package typesDataStruct.strings.proc

/**
 * Lucky number
 * https://hyperskill.org/learn/daily/9046
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Lucky number ***")

    // Variables
    val userInput = readln()
    val inputHalfIndex = userInput.length / 2
    var sumLeft = 0

    for (ch in 0 until inputHalfIndex) {
        sumLeft += userInput[ch].digitToInt()
    }
    println(sumLeft) // DEBUG

    println("\n*** End of exercise ***")
}