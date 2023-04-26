package typesDataStruct.dataTypes.ranges

/**
 * Exercise: Not in range
 * https://hyperskill.org/learn/step/20135
 * @author JetBrains Academy
 */

const val LOW_LIMIT = 1
const val HIGH_LIMIT = 10

fun exercise1() {
    println("*** Exercise: Not in range ***")

    val userInput = readln().toInt()
    println(userInput !in LOW_LIMIT..HIGH_LIMIT)

    println("\n*** End of exercise ***")
}