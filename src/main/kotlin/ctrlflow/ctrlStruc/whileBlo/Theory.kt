package ctrlflow.ctrlStruc.whileBlo

import java.util.Scanner

fun theory() {
    // https://hyperskill.org/learn/step/4659
    println("***** Theory *****")

    println("\n1) While loop")
    var someInt = 0
    while (someInt < 5) {
        println("\t. i = ${someInt++}")
    }

    var someChar = 'A'
    while (someChar <= 'Z') {
        println("\t. ${someChar++}")
    }

    /*
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next()
        println(next)
    }
     */

    println("\n2) do...while loop")
    do {
        val userInput1 = readln().toInt()
        println("You entered another positive number")
    } while (userInput1 > 0)
    println("Negative or 0; this is the end")


    println("\n***** End of theory *****")
}