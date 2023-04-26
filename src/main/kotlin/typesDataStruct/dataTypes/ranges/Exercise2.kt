package typesDataStruct.dataTypes.ranges

/**
 * Exercise: Job
 * https://hyperskill.org/learn/step/4670
 * @author JetBrains Academy
 */

const val MIN_AGE = 18
const val MAX_AGE = 59

fun exercise2() {
    println("*** Exercise: Job ***")

    val ageRange = MIN_AGE..MAX_AGE
    println(readln().toInt() in ageRange)

    println("\n*** End of exercise ***")
}