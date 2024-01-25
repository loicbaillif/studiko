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


open class Animal() {

}

open class Mammal(): Animal() {

}

class Lion(): Mammal() {

}




open class Fish(): Animal() {

}

class Salmon(): Fish() {

}

class Carp(): Fish() {

}



open class Bird(): Animal() {

}

class Eagle(): Bird() {

}