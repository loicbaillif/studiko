package projects.coffeeMachine

import kotlin.math.min


fun checkResources(machineStock: MutableList<Int>, drinkNeeds: MutableList<Int>): Boolean {
    val resourcesList = listOf<String>("water", "milk", "coffee beans", "disposable cups")
    repeat(drinkNeeds.size) {
        if (machineStock[it] < drinkNeeds[it]) {
            println(MISSING_RESOURCE.format(resourcesList[it]))
            return false
        }
    }
    return true
}


fun displayResultSt3(nbCups: Int, maxCups: Int) {
    val delta = maxCups - nbCups
    println(when {
        delta > 0 -> RESULT_MORE.format(delta)
        delta < 0 -> RESULT_NOT_ENOUGH.format(maxCups)
        else -> RESULT_OK
    })
}


fun getNbCoffee (water: Int, milk: Int, coffeeBeans: Int): Int {
    var maxCups = water / WATER_PER_COFFEE
    maxCups = min(maxCups, milk / MILK_PER_COFFEE)
    maxCups = min(maxCups, coffeeBeans / COFFEE_BEANS_PER_COFFEE)

    return maxCups
}


fun menuStage2 () {
    // Variables
    val nbCups: Int

    println(PROMPT_NB_CUPS)
    nbCups = readln().toInt()

    printCoffeeQty(nbCups)
}


fun menuStage3 () {
    // Initiate quantities
    println(INIT_WATER)
    val water = readln().toInt()
    println(INIT_MILK)
    val milk = readln().toInt()
    println(INIT_COFFEE_BEANS)
    val coffeeBeans = readln().toInt()
    val maxCups = getNbCoffee(water, milk, coffeeBeans)

    // Get nb of coffees
    println(PROMPT_NB_CUPS)
    val nbCups = readln().toInt()

    displayResultSt3(nbCups, maxCups)
}


fun menuStage4 () {
    // Machine resources
    val coffeeBeans = BEGIN_COFFEE_BEANS
    val cups = BEGIN_CUPS
    val milk = BEGIN_MILK
    val money = BEGIN_MONEY
    val water = BEGIN_WATER
    val machineStock = mutableListOf(water, milk, coffeeBeans, cups, money)

    printMachineStatus(machineStock)

    println(MAIN_MENU)
    val userChoice = readln()
    treatUserInput(userChoice, machineStock)

    printMachineStatus(machineStock)
}


fun menuStage5() {
    // Variables
    var userChoice: String
    val machineStock = mutableListOf(BEGIN_WATER, BEGIN_MILK, BEGIN_COFFEE_BEANS, BEGIN_CUPS, BEGIN_MONEY)

    // Loop
    do {
        println(MAIN_MENU)
        userChoice = readln()
        treatUserInput(userChoice, machineStock)
    } while (userChoice != "exit")
}


fun printCoffeeQty (nbCups: Int) {
    /**
     * Print the required quantity of each ingredient for nbCups of coffee
     */

    // Variables
    val qtyBeans = nbCups * COFFEE_BEANS_PER_COFFEE
    val qtyMilk = nbCups * MILK_PER_COFFEE
    val qtyWater = nbCups * WATER_PER_COFFEE

    // Result
    println(QUANTITY_NB_CUPS.format(nbCups, qtyWater, qtyMilk, qtyBeans))
}


fun printMachineStatus (machineStock: MutableList<Int>) {
    println(MACHINE_STATUS.format(
        machineStock[0],
        machineStock[1],
        machineStock[2],
        machineStock[3],
        machineStock[4]).trimIndent())
}


fun treatUserInput (userChoice: String, machineStock: MutableList<Int>) {
    when (userChoice) {
        "buy" -> treatBuy(machineStock)
        "exit" -> null
        "fill" -> treatFill(machineStock)
        "remaining" -> printMachineStatus(machineStock)
        "take" -> treatTake(machineStock)
        else -> println("Can't do that.")
    }
}


fun treatBuy (machineStock: MutableList<Int>) {
    // Variables
    val ingredients = mutableListOf<MutableList<Int>>(
        mutableListOf(0, 0, 0, 0, 0),           // Placeholder
        mutableListOf(250, 0, 16, 1, -4),       // Espresso
        mutableListOf(350, 75, 20, 1, -7),      // Coffee
        mutableListOf(200, 100, 12, 1, -6)      // Cappuccino
    )

    println(SUBMENU_BUY)
    val userDrink = readln().toInt()
    if (checkResources(machineStock, ingredients[userDrink])) {
        updateStock(machineStock, ingredients[userDrink])
    }

}


fun treatFill (machineStock: MutableList<Int>) {
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


fun treatTake (machineStock: MutableList<Int>) {
    println(SUBMENU_TAKE.format(machineStock.last()))
    machineStock[machineStock.lastIndex] = 0
}


fun updateStock (machineStock: MutableList<Int>, beverageIngredients: MutableList<Int>) {
    repeat(machineStock.size) {
        machineStock[it] -= beverageIngredients[it]
    }
}