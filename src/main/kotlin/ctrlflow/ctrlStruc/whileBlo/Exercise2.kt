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

    // Treat first occurrence
    print(1)
    if (userInput < 1) return

    // Other occurrences if needed
    while (userInput > 0) {
        repeat(cpt) {
            print(" $cpt")
            if (--userInput == 0) return
        }
        cpt++
    }

    println("\n*** End of exercise ***")
}