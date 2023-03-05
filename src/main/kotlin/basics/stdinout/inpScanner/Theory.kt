package basics.stdinout.inpScanner

import java.util.Scanner

fun theory() {
    // https://hyperskill.org/learn/step/4445
    println("***** Theory *****")

    println("*** 1) What is Java Scanner")
    println("Need to be imported")
    val scanner = Scanner(System.`in`)
    val someText = scanner.nextLine() // Reads an entire line
    val someInt = scanner.nextInt() // Reads an integer
    val someWord = scanner.next() // Reads a 'word' (breaks at space)
    println("Some text: $someText")
    println("An integer: $someInt")
    println("A word: $someWord")

    println("\n\n***** End of Theory *****")
}