package basics.stdinout.inpScanner

import java.util.Scanner

fun exercise1() {
    // https://hyperskill.org/learn/step/4451
    // Printing each word in a new line
    println("*** Exercise: Printing each word in a new line ***")
    val scanner = Scanner(System.`in`)
    val userInput1 = scanner.next()
    val userInput2 = scanner.next()
    val userInput3 = scanner.next()
    val userInput4 = scanner.next()
    val userInput5 = scanner.next()
    println(userInput1)
    println(userInput2)
    println(userInput3)
    println(userInput4)
    println(userInput5)

    println("\n*** End of Exercise ***")
}