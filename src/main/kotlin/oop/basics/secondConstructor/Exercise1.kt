package oop.basics.secondConstructor

/**
 * Exercise: Cat House
 * https://hyperskill.org/learn/step/20608
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Cat House ***")



    println("\n*** End of exercise ***")
}


class Kitty() {

    constructor(color: String, age: Int): this() {

    }

    constructor(age: Int, color: String): this() {

    }

    constructor(color: String): this() {

    }

    constructor(age: Int): this() {

    }
}