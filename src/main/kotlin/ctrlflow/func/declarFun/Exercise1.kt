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

fun isGreater(intList: MutableList<Int>) = intList[0] + intList[1] > intList[2] + intList[3]