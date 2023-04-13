package ctrlflow.ctrlStruc.whileBlo

fun exercise1() {
    // https://hyperskill.org/learn/step/4720
    // Balance Checker
    println("*** Exercise: Balance Checker ***")

    var balance = readln().toInt()
    val purchases = readln().split(' ').map { it.toInt()}.toMutableList()
    var enoughMoney = true
    var nbPurchase = 0

    while (enoughMoney && nbPurchase < purchases.size) {
        if (purchases[nbPurchase] > balance) {
            enoughMoney = false
            println("Error, insufficient funds for the purchase. " +
                    "Your balance is $balance, but you need ${purchases[nbPurchase]}.")
        } else {
            balance -= purchases[nbPurchase]
        }

        nbPurchase++
    }

    if (enoughMoney) {
        println("Thank you for choosing us to manage your account! " +
                "Your balance is $balance.")
    }

    println("\n*** End of exercise ***")
}