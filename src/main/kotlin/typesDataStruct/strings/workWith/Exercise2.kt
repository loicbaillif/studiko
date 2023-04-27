package typesDataStruct.strings.workWith

/**
 * Exercise: N-th symbol
 * https://hyperskill.org/learn/step/4630
 * @author JetBrains Academy
 */

fun exercise2() {
    println("*** Exercise: N-th symbol ***")

    val inputString = readln()
    val inputNumber = readln().toInt()
    val output = inputString[inputNumber - 1]
    println("Symbol # $inputNumber of the string \"$inputString\" is '$output'")

    println("\n*** End of exercise ***")
}