package ctrlflow.func.declarFun

/**
 * Exercise: Comparing sums
 * https://hyperskill.org/learn/step/4587
 * @author JetBrains Academy
 * Solution proposed by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Comparing sums ***")

    val userInput1 = readln().toInt()
    val userInput2 = readln().toInt()
    val userInput3 = readln().toInt()
    val userInput4 = readln().toInt()

    println("\n*** End of exercise ***")
}

fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int): Boolean {
    val sumFirst = number1 + number2
    val sumLast = number3 + number4
    return sumFirst > sumLast
}