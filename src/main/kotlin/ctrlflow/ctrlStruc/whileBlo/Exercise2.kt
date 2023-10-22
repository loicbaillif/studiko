package ctrlflow.ctrlStruc.whileBlo

/**
 * Exercise: The sequence 1 2 2 3 3 3 ...
 * https://hyperskill.org/learn/step/4668
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: The sequence 1 2 2 3 3 3 ...")

    var userInput = readln().toInt() - 1
    var cpt = 2

    print(1)

    if (userInput < 1) {
        return
    }

    while (userInput > 0) {
        repeat(cpt) {
            print(" $cpt")
            userInput--
        }
        cpt++
    }

    println("\n*** End of exercise ***")
}