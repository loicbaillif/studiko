package ctrlflow.ctrlStruc.whileBlo

import java.util.Scanner

fun exercise1() {
    // https://hyperskill.org/learn/step/4720
    // Balance Checker
    println("*** Exercise: Balance Checker ***")

    var balance = readln().toInt()
    var enoughMoney = true
    var purchase = 0
    val scanner = Scanner(System.`in`)

    while (balance >= 0 && scanner.hasNextInt()) {
        purchase = readln().toInt()
        balance -= purchase
        if (balance < 0) enoughMoney = false
    }

    if (enoughMoney) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
    }


    println("\n*** End of exercise ***")
}