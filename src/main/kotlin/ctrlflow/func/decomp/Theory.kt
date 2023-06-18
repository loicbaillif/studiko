package ctrlflow.func.decomp

import java.lang.NumberFormatException

/**
 * Theory: Functional decomposition
 * https://hyperskill.org/learn/step/12668
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Solving complex tasks ***")
    chooseAction()
}


fun chooseAction() {
    println("Please choose what you want to do?\n\t1: Control light\n\t2: Control music")
    var userChoice = 0
    try {
        userChoice = readln().toInt()
    } catch (wrongInput: NumberFormatException) {
        println("Sorry, wrong input")
    }

    when (userChoice) {
        1 -> println("Control light selected")
        2 -> println("Control music selected")
        else -> println("This feature does not exist ... yet")
    }
}