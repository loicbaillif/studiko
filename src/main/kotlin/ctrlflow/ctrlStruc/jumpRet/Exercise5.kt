package ctrlflow.ctrlStruc.jumpRet

/**
 * Exercise: Unique characters
 * https://hyperskill.org/learn/step/7868
 * @author JetBrains Academy
 * Solution By Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Unique characters ***")

    val userInput = readln()
    val sortedInput = userInput.toCharArray().sorted()
    var nbUniques = 0

    if (sortedInput[1] != sortedInput[0]) nbUniques++ // First

    for (i in 1 until sortedInput.lastIndex) {
        if (sortedInput[i] == sortedInput[i + 1] || sortedInput[i] == sortedInput[i - 1]) {
            continue
        }
        nbUniques++
    }

    if (sortedInput.last() != sortedInput[sortedInput.lastIndex - 1]) nbUniques++ // Last

    println(nbUniques)

    println("\n*** End of exercise ***")
}