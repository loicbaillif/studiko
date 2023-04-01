package typesDataStruct.basicOps.relOps

const val lowLimit = 10
fun exercise1() {
    // https://hyperskill.org/learn/step/4531
    // Who is less than 10?
    println("\n*** Exercise: Who is less than 10? ***")
    val userInput = readln().toInt()
    println(userInput < lowLimit)

    println("\n*** End of Exercise ***")
}