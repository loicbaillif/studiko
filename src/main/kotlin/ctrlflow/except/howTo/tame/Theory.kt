package ctrlflow.except.howTo.tame

/**
 * Theory: Taming exceptions
 * https://hyperskill.org/learn/step/7601
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")



    println("\n***** End of theory *****")
}


fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
    val qtyToBuy = total / itemPrice
    return qtyToBuy * itemPrice
}