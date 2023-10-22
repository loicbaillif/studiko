package ctrlflow.ctrlStruc.whileBlo

/**
 * Exercise: The sequence 1 2 2 3 3 3 ...
 * https://hyperskill.org/learn/step/4668
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: The sequence 1 2 2 3 3 3 ...")

    var userInput = readln().toInt()
    var cpt = 1

    while (userInput > 0) {
        repeat(cpt) {
            userInput--
        }
        cpt++
    }

    println("\n*** End of exercise ***")
}