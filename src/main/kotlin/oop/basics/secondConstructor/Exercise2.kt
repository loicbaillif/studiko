package oop.basics.secondConstructor

/**
 * Exercise: Barista problem
 * https://hyperskill.org/learn/step/10751
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Barista problem ***")



    println("\n*** End of exercise ***")
}


class EspressoMachine() {
    var costPerServing: Float = 0.0F

    constructor(coffeeCapsulesCount: Int, totalCost: Float): this() {
        this.costPerServing = totalCost / coffeeCapsulesCount
    }

    constructor(coffeeBeansWeight: Float, totalCost: Float): this() {
        this.costPerServing = totalCost / (coffeeBeansWeight / 10)
    }
}