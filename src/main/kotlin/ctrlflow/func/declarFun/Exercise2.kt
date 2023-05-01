package ctrlflow.func.declarFun

/**
 * Exercise: Get last digit
 * https://hyperskill.org/learn/step/4589
 * @author: JetBrains Academy
 * Solution proposed by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Get last digit")



    println("\n*** End of exercise ***")
}

fun getLastDigit(someInt: Int): Int {
    val lastDigit = someInt % 10
    return lastDigit
}