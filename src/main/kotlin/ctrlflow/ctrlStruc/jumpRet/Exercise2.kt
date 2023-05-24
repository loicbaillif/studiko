package ctrlflow.ctrlStruc.jumpRet

/**
 * Exercise: Beyond the word
 * https://hyperskill.org/learn/step/6171
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Beyond the word ***")

    val userWord = readln().lowercase()
    for (ch in 'a'..'z') {
        if (ch in userWord) {
            continue
        }
        print(ch)
    }

    println("\n*** End of exercise ***")
}