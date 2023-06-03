package ctrlflow.except.howTo.tryCatFin

import java.lang.NumberFormatException

/**
 * Theory: The try-catch-finally statement
 * https://hyperskill.org/learn/step/11809
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) The finally block ***")

    println("\n*** 2) First example")

    try {
        // Code which might throw an exception
        println("We try to do a division by 0")
        println(2 / 0)
    } catch (e: Exception) {
        // Exception handler
        println("We have an exception")
    } finally {
        // This code is always executed
        println("We execute this block, no matter what.")
    }

    println("\n*** 3) try-finally")
    /*
    try {
        println(3 / 0)
    } finally {
        println("Instruction from the finally block")
    }
    println("Instruction outside the \"try-finally\" block.") // Never executed
     */

    println("\n*** 4) Try is an expression")
    val someInt: Int =
        try {
            readln().toInt()
        } catch (e: NumberFormatException) {
            -1
        }
    println("int from user input = $someInt")
}