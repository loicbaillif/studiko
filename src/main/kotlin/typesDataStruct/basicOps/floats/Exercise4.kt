package typesDataStruct.basicOps.floats

/**
 * Exercise: Celsius to Fahrenheit
 * https://hyperskill.org/learn/step/4512
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val A_COEF = 1.8
const val B_OFFSET = 32

fun exercise4() {
    println("*** Exercise: Celsius to Fahrenheit ***")

    println(readln().toDouble() * A_COEF + B_OFFSET)

    println("\n*** End of exercise ***")
}