package ctrlflow.ctrlStruc.jumpRet

/**
 * Exercise: First digit
 * https://hyperskill.org/learn/step/7867
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: First digit ***")

    for (ch in readln()) {
        if (ch in '0'..'9') {
            println(ch)
            break // return would work as well
        }
    }

    println("\n*** End of exercise ***")
}