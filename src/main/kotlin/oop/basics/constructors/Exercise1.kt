package oop.basics.constructors

/**
 * Exercise: Pets
 * https://hyperskill.org/learn/step/10877
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Pets ***")

    val someCat = Pet("Titi", _owner = "Granny")
    someCat.introduce()

    println("\n*** End of exercise ***")
}


class Pet(val _name: String, val _animal: String = "cat", val _owner: String) {

    fun introduce() {
        println("I am $_name, a $_animal owned by $_owner")
    }
}