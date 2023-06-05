package typesDataStruct.basicOps.floats

/**
 * Exercise: Liquid pressure
 * https://hyperskill.org/learn/step/4620
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

// Constants
const val GRAVITY_CONSTANT = 9.8 // m.s^(-2)

fun exercise2() {
    println("*** Exercise: Liquid pressure ***")

    // Variables
    val rho = readln().toDouble()
    val height = readln().toDouble()
    val pressure = rho * height * GRAVITY_CONSTANT

    println(pressure)

    println("\n*** End of exercise ***")
}