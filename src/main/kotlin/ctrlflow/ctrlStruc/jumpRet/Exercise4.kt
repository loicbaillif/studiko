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
    printLetters(readln().first())

    println("\n*** End of exercise ***")
}


fun printLetters(userLetter: Char, firstLetter: Char = 'a', lastLetter: Char = 'z') {
    var currentLetter = firstLetter

    while (true) {
        print(currentLetter)
        currentLetter += 1
        if (currentLetter == userLetter || currentLetter > lastLetter) return
    }
}