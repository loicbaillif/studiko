package oop.basics.propAccess

/**
 * Exercise: Custom Getter
 * https://hyperskill.org/learn/step/7367
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Custom Getter ***")



    println("\n*** End of exercise ***")
}


class Smartphone1(val name: String) {
    val price: Int = -5
        get() = name.length - field
}