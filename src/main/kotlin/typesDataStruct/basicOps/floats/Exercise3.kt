package typesDataStruct.basicOps.floats

/**
 * https://hyperskill.org/learn/step/4509
 * Exercise: Evaluate an expression
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

// Constants
const val OPERAND_1 = 10.5
const val OPERAND_2 = 4.4

fun exercise3() {
    println("*** Exercise: Evaluate an expression ***")

    // Variables
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val d = readln().toDouble()

    println(a * OPERAND_1 + b * OPERAND_2 + (c + d) / (OPERAND_2 / 2))

    println("\n*** End of exercise ***")
}