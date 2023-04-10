package ctrlflow.ctrlStruc.whileBlo

import java.util.Scanner

fun exercise1() {
    // https://hyperskill.org/learn/step/4720
    // Balance Checker
    println("*** Exercise: Balance Checker ***")

    var balance = readln().toInt()
    var enoughMoney = true
    val scanner = Scanner(System.`in`)

    while (balance >= 0 && scanner.hasNextInt()) {
        val purchase = readln().toInt()
        balance -= purchase
    }

    println("\n*** End of exercise ***")
}