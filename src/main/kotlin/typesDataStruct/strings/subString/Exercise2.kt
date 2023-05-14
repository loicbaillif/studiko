package typesDataStruct.strings.subString

/**
 * Exercise: Exchange
 * https://hyperskill.org/learn/step/12366
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Exchange ***")

    val userInput = readln()
    print(userInput.last())
    print(userInput.substringBeforeLast(userInput.last()).substring(1))
    println(userInput.first())

    println("\n*** End of exercise ***")
}