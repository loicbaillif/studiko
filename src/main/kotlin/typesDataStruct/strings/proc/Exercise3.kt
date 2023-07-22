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

    // First half
    for (ch in 0 until inputHalfIndex) sumLeft += userInput[ch].digitToInt()

    // Second half
    for (ch in inputHalfIndex..userInput.lastIndex) sumLeft -= userInput[ch].digitToInt()

    println(if (sumLeft == 0) "YES" else "NO")

    println("\n*** End of exercise ***")
}