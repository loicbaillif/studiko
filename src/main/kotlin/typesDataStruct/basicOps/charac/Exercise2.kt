package typesDataStruct.basicOps.charac

fun exercise2() {
    // https://hyperskill.org/learn/step/4686
    // Compare Latin letters
    println("\n*** Exercise: Compare Latin letters ***")

    val userInput1 = readln().first()
    val userInput2 = readln().first()
    println(userInput1.lowercaseChar() == userInput2.lowercaseChar())

    println("\n*** End of exercise ***")
}