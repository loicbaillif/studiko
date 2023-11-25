package projects.coffeeMachine

import kotlin.math.min


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
        "take" -> treatTake(machineStock)
        else -> println("Can't do that.")
    }
}


fun treatTake (machineStock: MutableList<Int>) {
    println(SUBMENU_TAKE.format(machineStock.last()))
    machineStock[machineStock.lastIndex] = 0
}