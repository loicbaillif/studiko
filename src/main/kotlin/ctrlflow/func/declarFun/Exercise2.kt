package ctrlflow.func.declarFun

/**
 * Exercise: Get last digit
 * https://hyperskill.org/learn/step/4589
 * @author: JetBrains Academy
 * Solution proposed by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Get last digit")

    val userInput = readln().toInt()
    println(getLastDigit(userInput))

    println("\n*** End of exercise ***")
}

fun getLastDigit(someInt: Int): Int {
    val lastDigit = someInt % 10
    if (lastDigit > 0) return lastDigit
    return -1 * lastDigit
}