package oop.classHiearchy.inheritance

/**
 * Exercise: Fix bugs
 * https://hyperskill.org/learn/step/20488
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Unlucky one ***")

    val bus = Bus("Personal", "N4", 130)
    bus.printInfo()

    println("\n*** End of exercise ***")
}


class Bus(val typeOfBus: String, model: String, speed: Int) : Car(model, speed) {
    fun printInfo() = println("Type of bus: $typeOfBus, model: $model, speed: $speed")
}


open class Car(model: String, speed: Int) {}