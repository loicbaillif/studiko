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


open class AnimalEx1(name: String) {
    open fun makeSound(): String {
        return "To be defined ..."
    }
}

open class MammalEx1(name: String): AnimalEx1(name) {

}

class LionEx1(val name: String): MammalEx1(name) {
    override fun makeSound(): String {
        return "rrRrrroaaaAAArrr says the $name"
    }
}




open class FishEx1(name: String): AnimalEx1(name) {

}

class SalmonEx1(val name: String): FishEx1(name) {
    override fun makeSound(): String {
        return "Splish Splosh says the $name"
    }
}

class CarpEx1(val name: String): FishEx1(name) {
    override fun makeSound(): String {
        return "Blop blop says the $name"
    }
}



open class BirdEx1(name: String): AnimalEx1(name) {

}

class EagleEx1(val name: String): BirdEx1(name) {
    override fun makeSound(): String {
        return "IiiiiIIIyYYIiiyyy says the $name"
    }
}