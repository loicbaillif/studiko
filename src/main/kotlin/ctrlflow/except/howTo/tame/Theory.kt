package ctrlflow.except.howTo.tame

import java.lang.Exception

/**
 * Theory: Taming exceptions
 * https://hyperskill.org/learn/step/7601
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Another type of exceptions ***")
    println("\t. Item to buy = hamburger - Price = 2 € - Budget = 17 €:")
    println("\t. Money to spend = ${calculateSpentMoney(17, 2)} €")
    println("\n\t. Item to buy = sample candy - Price = 0€ - Budget = 13 €:")
    println("\t. Money to spend = ${calculateSpentMoney(13, 0)}")

    println("\n*** 2) Throwing exceptions ***")
    println("\t. Item to buy = hamburger - Price = 2 € - Budget = -7 €:")
    println("\t. Money to spend = ${calculateSpentMoney(-7, 2)} €")

    println("\n***** End of theory *****")
}


fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
    // Catch a negative total (nonsense)
    if (total < 0) throw Exception("Total cannot be negative")

    // Catch exception to avoid 0 division
    if (itemPrice == 0) return 0

    val qtyToBuy = total / itemPrice
    return qtyToBuy * itemPrice
}