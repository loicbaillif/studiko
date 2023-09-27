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

    for (i in 1 until sortedInput.lastIndex) {
        if (sortedInput[i] == sortedInput[i + 1] || sortedInput[i] == sortedInput[i - 1]) {
            continue
        }
        nbUniques++
    }

    println(nbUniques)

    println("\n*** End of exercise ***")
}