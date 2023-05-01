package ctrlflow.func.declarFun

/**
 * Exercise: Comparing sums
 * https://hyperskill.org/learn/step/4587
 * @author JetBrains Academy
 * Solution proposed by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Comparing sums ***")

    val inputList = MutableList(4) { readln().toInt() }
    println(isGreater(inputList))

    println("\n*** End of exercise ***")
}

fun isGreater(inputList: MutableList<Int>): Boolean {
    val sumFirst = inputList[0] + inputList[1]
    val sumLast = inputList[2] + inputList[3]
    return sumFirst > sumLast
}