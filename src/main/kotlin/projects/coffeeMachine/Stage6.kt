package projects.coffeeMachine

/**
 * Stage 6/6: Brush up your code
 * https://hyperskill.org/projects/67/stages/365/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage6() {

}


class CoffeeMachine() {
    var coffeeBeans = BEGIN_COFFEE_BEANS // grams
    var cups = BEGIN_CUPS
    var milk = BEGIN_MILK
    var money = BEGIN_MONEY
    var water = BEGIN_WATER

    val statusList = listOf("main", "buy", "fill", "take", "remaining", "exit")
    val drinksList = listOf("1", "2", "3", "back")
    var currentStatus = statusList[0]

    fun getUserInput() : String {
        val userInput = readln();

        if (statusList.contains(userInput)) return userInput
        if (drinksList.contains(userInput)) return userInput else return "main"
    }
}