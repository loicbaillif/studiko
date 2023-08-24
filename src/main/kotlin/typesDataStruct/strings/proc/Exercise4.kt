package typesDataStruct.strings.proc

/**
 * Exercise: Double characters
 * https://hyperskill.org/learn/daily/9040
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */


fun exercise4() {
    println("*** Exercise: Double characters ***")

    // Variables
    val userInput = readln()

    // Loop
    for (ch in userInput) {
        print("$ch$ch")
    }

    println()

    println("\n*** End of exercise ***")
}