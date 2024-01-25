package oop.classHiearchy.inheritance

/**
 * Exercise: Contructing a hierarchy
 * https://hyperskill.org/learn/step/20487
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Unlucky one ***")



    println("\n*** End of exercise ***")
}


open class Animal(name: String) {
    open fun makeSound(): String {
        return "To be defined ..."
    }
}

open class Mammal(name: String): Animal(name) {

}

class Lion(name: String): Mammal(name) {
    override fun makeSound(): String {
        return "rrRrrroaaaAAArrr"
    }
}




open class Fish(name: String): Animal(name) {

}

class Salmon(name: String): Fish(name) {
    override fun makeSound(): String {
        return "Splish Splosh"
    }
}

class Carp(name: String): Fish(name) {
    override fun makeSound(): String {
        return "Blop blop"
    }
}



open class Bird(name: String): Animal(name) {

}

class Eagle(name: String): Bird(name) {

}