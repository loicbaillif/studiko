package ctrlflow.except.howTo.tame

/**
 * Exercise: Handle string exception
 * https://hyperskill.org/learn/step/7606
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Handle string exception ***")

    // Variables
    val index = readln().toInt()
    val word = readln()
    val errorMessage = "There isn't such an element in the given string, please fix the index!"

    if (index > word.lastIndex) {
        println(errorMessage)
    } else {

    }

    println("\n*** End of exercise ***")
}