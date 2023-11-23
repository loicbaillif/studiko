package projects.coffeeMachine

import projects.converter.PROMPT_STAGE2


fun menuStage2 (): Unit {
    // Variables
    val nbCups: Int

    println(PROMPT_STAGE2)
    nbCups = readln().toInt()

    printCoffeeQty(nbCups)
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