package typesDataStruct.basicOps.relOps

fun exercise2() {
    // https://hyperskill.org/learn/step/4535
    // Are the numbers different?
    println("*** Exercise: Are the numbers different? ***")

    val userInput1 = readln().toInt()
    val userInput2 = readln().toInt()
    val userInput3 = readln().toInt()
    val result = (userInput1 != userInput2) && (userInput1 != userInput3) && (userInput2 != userInput3)
    println(result)


    println("\n*** End of Exercise ***")
}