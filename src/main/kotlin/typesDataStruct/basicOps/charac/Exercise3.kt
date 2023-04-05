package typesDataStruct.basicOps.charac

fun exercise3() {
    // https://hyperskill.org/learn/step/12309
    // Exercise: Comparing numbers and characters
    println("\n*** Exercise: Comparing numbers and characters ***")

    val inputNumber = readln().toInt()
    val inputChar = readln().first()

    println(inputNumber == inputChar.code)

    println("\n*** End of exercise ***")
}