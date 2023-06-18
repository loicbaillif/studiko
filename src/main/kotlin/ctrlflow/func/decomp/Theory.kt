package ctrlflow.func.decomp

import java.lang.NumberFormatException

/**
 * Theory: Functional decomposition
 * https://hyperskill.org/learn/step/12668
 * @author JetBrains Academy
 */


var lightStatus = false

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


fun controlLight() {
    println("Light control module.")
    println("\t1: Switch OFF")
    println("\t2: Switch ON")
    val choiceLight = readln().toInt()
    if (choiceLight == 1 && lightStatus) println("Switching OFF the light")
    if (choiceLight == 2 && !lightStatus) println("Switching ON the light")

    println("The light is %s".format(if (lightStatus) "ON" else "OFF"))
}