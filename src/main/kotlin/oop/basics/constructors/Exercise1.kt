package oop.basics.constructors

/**
 * Exercise: Pets
 * https://hyperskill.org/learn/step/10877
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Pets ***")

    val someCat = Pet("titi", _owner = "Granny")

    println("\n*** End of exercise ***")
}


class Pet(_name: String, _animal: String = "cat", _owner: String)