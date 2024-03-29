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
    println("\n\t. Item to buy = sample candy - Price = 0€ - Budget = 13 €:")
    println("\t. Money to spend = ${calculateSpentMoney(13, 0)}")

    println("\n*** 2) Throwing exceptions ***")
    println("\t. Item to buy = hamburger - Price = 2 € - Budget = -7 €:")
    var result: String
    result = try {
        (calculateSpentMoney(-7, 2)).toString()
    } catch (e: Exception) {
        "Not applicable ... Disregard"
    }
    println("\t. Money to spend = $result €")

    result = try {
        (calculateSpentMoney(37, -2)).toString()
    } catch (e: Exception) {
        "${e.message}"
    }
    println("\n\t. Item to buy = hamburger - Price = -2 € - Budget = 37 €:")
    println("\t. Money to spend = $result €")

    println("\n***** End of theory *****")
}


fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
    // Catch a negative total (nonsense)
    if (total < 0) throw Exception("Total cannot be negative")

    // Catch a negative itemPrice (another nonsense)
    if (itemPrice < 0) throw Exception("Error: Item price cannot be negative")

    // Catch exception to avoid 0 division
    if (itemPrice == 0) return 0

    val qtyToBuy = total / itemPrice
    return qtyToBuy * itemPrice
}