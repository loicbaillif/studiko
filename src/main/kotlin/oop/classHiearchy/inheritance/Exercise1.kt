package oop.classHiearchy.inheritance

/**
 * Exercise: Contructing a hierarchy
 * https://hyperskill.org/learn/step/20487
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Unlucky one ***")

    val lion1 = Lion("Simba")
    val salmon1 = Salmon("Fresh")
    val carp1 = Carp("Koi")
    val eagle1 = Eagle("Eye-cherry")

    println(lion1.makeSound())
    println(salmon1.makeSound())
    println(carp1.makeSound())
    println(eagle1.makeSound())

    println("\n*** End of exercise ***")
}


open class Animal(name: String) {
    open fun makeSound(): String {
        return "To be defined ..."
    }
}

open class Mammal(name: String): Animal(name) {

}

class Lion(val name: String): Mammal(name) {
    override fun makeSound(): String {
        return "rrRrrroaaaAAArrr says the $name"
    }
}




open class Fish(name: String): Animal(name) {

}

class Salmon(val name: String): Fish(name) {
    override fun makeSound(): String {
        return "Splish Splosh says the $name"
    }
}

class Carp(val name: String): Fish(name) {
    override fun makeSound(): String {
        return "Blop blop says the $name"
    }
}



open class Bird(name: String): Animal(name) {

}

class Eagle(val name: String): Bird(name) {
    override fun makeSound(): String {
        return "IiiiiIIIyYYIiiyyy says the $name"
    }
}