package ctrlflow.ctrlStruc.jumpRet

/**
 * Exercise: Getting letters from the Alphabet
 * https://hyperskill.org/learn/step/6170
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Getting letters from the Alphabet ***")

    // Variables
    val userLetter = readln().first()
    val lastLetter = 'z'
    var firstLetter = 'a'

    while (true) {
        print(firstLetter)
        firstLetter += 1
        if (firstLetter == userLetter || firstLetter > lastLetter) return
    }

    println("\n*** End of exercise ***")
}