package typesDataStruct.dataTypes.nullNonNull

/**
 * Exercise: Null or not null
 * https://hyperskill.org/learn/step/20494
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Null or not null ***")



    println("\n*** End of exercise ***")
}

fun nullOrNotNull(number: Int?): Int? {
    if (number == null) return -1
    return number
}