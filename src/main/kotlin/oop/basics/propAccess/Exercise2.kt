package oop.basics.propAccess

/**
 * Exercise: Weather comparison
 * https://hyperskill.org/learn/step/7369
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val AVERAGE_DUBAI = 30
const val AVERAGE_HANOI = 20
const val AVERAGE_MOSCOW = 5

fun exercise2() {
    println("*** Exercise: Weather comparison ***")



    println("\n*** End of exercise ***")
}


class City(val name: String) {
    var degrees: Int
}