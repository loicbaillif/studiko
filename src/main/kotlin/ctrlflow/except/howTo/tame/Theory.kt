package ctrlflow.except.howTo.tame

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
    println("\n. Item to buy = sample candy - Price = 0€ - Budget = 13 €:")
    println("\t. Money to spend = ${calculateSpentMoney(13, 0)}")

    println("\n***** End of theory *****")
}


fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
    val qtyToBuy = total / itemPrice
    return qtyToBuy * itemPrice
}