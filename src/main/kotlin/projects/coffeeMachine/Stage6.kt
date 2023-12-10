package projects.coffeeMachine

/**
 * Stage 6/6: Brush up your code
 * https://hyperskill.org/projects/67/stages/365/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage6() {
    val coffeeMachine = CoffeeMachine()

    while (coffeeMachine.currentStatus != "exit") {
        if (coffeeMachine.currentStatus == "main") println(MAIN_MENU)
        val userInput = coffeeMachine.getUserInput()
        coffeeMachine.treatUserInput(userInput)
    }
}


class CoffeeMachine() {
    var coffeeBeans = BEGIN_COFFEE_BEANS // grams
    var cups = BEGIN_CUPS
    var milk = BEGIN_MILK
    var money = BEGIN_MONEY
    var water = BEGIN_WATER

    val statusList = listOf("main", "buy", "fill", "take", "remaining", "exit")
    val drinksListInput = listOf("1", "2", "3", "back")
    val drinksListText = listOf("none", "espresso", "latte", "cappuccino")
    var machineStock = mutableListOf(water, milk, coffeeBeans, cups, money)
    var currentStatus = statusList[0]

    fun getUserInput() : String {
        val userInput = readln()

        if (statusList.contains(userInput) || drinksListInput.contains(userInput)) return userInput
        return "main"
    }


    fun buy () {
        // Variables
        val ingredients = mutableListOf<MutableList<Int>>(
            mutableListOf(0, 0, 0, 0, 0),           // Placeholder
            mutableListOf(250, 0, 16, 1, -4),       // Espresso
            mutableListOf(350, 75, 20, 1, -7),      // Coffee
            mutableListOf(200, 100, 12, 1, -6)      // Cappuccino
        )

        println(SUBMENU_BUY)
        val userDrink = getUserInput()
        if (userDrink == "back") return
        if (verifyResources(ingredients[userDrink.toInt()])) {
            println(ENOUGH_RESOURCES.format(drinksListText[userDrink.toInt()]))
            updateStock(ingredients[userDrink.toInt()])
        }

    }


    fun fill () {
        val promptList = mutableListOf<String>(
            SUBMENU_FILL_WATER,
            SUBMENU_FILL_MILK,
            SUBMENU_FILL_COFFEE_BEANS,
            SUBMENU_FILL_CUPS)

        repeat(promptList.size) {
            println(promptList[it])
            machineStock[it] += readln().toInt()
        }

        println("\n")
    }


    fun printStatus () {
        println(MACHINE_STATUS.format(
            machineStock[0],
            machineStock[1],
            machineStock[2],
            machineStock[3],
            machineStock[4]).trimIndent())
    }


    fun take () {
        println(SUBMENU_TAKE.format(machineStock.last()))
        machineStock[machineStock.lastIndex] = 0
    }


    fun treatUserInput(userInput: String) {
        if (currentStatus == statusList[0]) {
            when (userInput) {
                "buy" -> this.buy()
                "exit" -> this.currentStatus = "exit"
                "fill" -> this.fill()
                "remaining" -> this.printStatus()
                "take" -> this.take()
                else -> println("Unknown request.")
            }
        }
    }

    fun updateStock (beverageIngredients: MutableList<Int>) {
        repeat(machineStock.size) {
            machineStock[it] -= beverageIngredients[it]
        }
    }


    fun verifyResources(drinkNeeds: MutableList<Int>): Boolean {
        val resourcesList = listOf<String>("water", "milk", "coffee beans", "disposable cups")
        repeat(drinkNeeds.size) {
            if (machineStock[it] < drinkNeeds[it]) {
                println(MISSING_RESOURCE.format(resourcesList[it]))
                return false
            }
        }
        return true
    }
}