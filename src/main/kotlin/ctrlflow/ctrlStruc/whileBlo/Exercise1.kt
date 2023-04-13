package ctrlflow.ctrlStruc.whileBlo

fun exercise1() {
    // https://hyperskill.org/learn/step/4720
    // Balance Checker
    println("*** Exercise: Balance Checker ***")

    var balance = readln().toInt()
    var purchases = readln().split(' ').map { it.toInt()}.toMutableList()
    var enoughMoney = true
    var nbPurchase = 0

    while (enoughMoney && nbPurchase < purchases.size) {

    }

    repeat(purchases.size) {
        println(purchases[it])
    }
    println(purchases.size)


    println("\n*** End of exercise ***")
}