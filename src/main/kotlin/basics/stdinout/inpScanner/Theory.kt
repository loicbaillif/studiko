package basics.stdinout.inpScanner

import java.util.Scanner

fun theory() {
    // https://hyperskill.org/learn/step/4445
    println("***** Theory *****")

    println("*** 1) What is Java Scanner ***")
    println("Need to be imported")
    var scanner = Scanner(System.`in`)
    val someText = scanner.nextLine() // Reads an entire line
    val someInt = scanner.nextInt() // Reads an integer
    val someWord = scanner.next() // Reads a 'word' (breaks at space)
    println("Some text: $someText")
    println("An integer: $someInt")
    println("A word: $someWord")

    println("*** 2) Custom delimiter ***")
    scanner = Scanner("123_456")
    scanner.useDelimiter("_")
    println(scanner.nextInt())
    println(scanner.nextInt())
    scanner = Scanner("red,yellow,blue,green")
    scanner.useDelimiter(",")
    println(scanner.next())
    println(scanner.next())
    println(scanner.next())
    println(scanner.next())

    println("*** 3) Check next element ***")
    scanner = Scanner ("One Two")
    if (scanner.hasNext()) {
        val someWord1 = scanner.next()
    }
    if (scanner.hasNext()) {
        val someWord2 = scanner.next()
    }
    if (scanner.hasNext()) {
        val someWord3 = scanner.next()
    }


    println("\n\n***** End of Theory *****")
}