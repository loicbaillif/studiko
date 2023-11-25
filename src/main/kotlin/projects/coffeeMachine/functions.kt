package projects.coffeeMachine

import kotlin.math.max
import kotlin.math.min


fun displayResultSt3(nbCups: Int, maxCups: Int): Unit {

}


fun getNbCoffee (water: Int, milk: Int, coffeeBeans: Int): Int {
    var maxCups = water / WATER_PER_COFFEE
    maxCups = min(maxCups, milk / MILK_PER_COFFEE)
    maxCups = min(maxCups, coffeeBeans / COFFEE_BEANS_PER_COFFEE)

    return maxCups
}


fun menuStage2 (): Unit {
    // Variables
    val nbCups: Int

    println(PROMPT_NB_CUPS)
    nbCups = readln().toInt()

    printCoffeeQty(nbCups)
}


fun menuStage3 (): Unit {
    // Initiate quantities
    println(INIT_WATER)
    val water = readln().toInt()
    println(INIT_MILK)
    val milk = readln().toInt()
    println(INIT_COFFEE_BEANS)
    val coffeeBeans = readln().toInt()
    val maxCups = getNbCoffee(water, milk, coffeeBeans)

    // Get nb of coffees
    val nbCups = readln().toInt()

    displayResultSt3(nbCups, maxCups)
}


fun printCoffeeQty (nbCups: Int): Unit {
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