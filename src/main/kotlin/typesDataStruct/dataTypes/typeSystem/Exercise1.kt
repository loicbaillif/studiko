package typesDataStruct.dataTypes.typeSystem

/**
 * Exercise: String length
 * https://hyperskill.org/learn/step/9696
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: String length ***")

    println(getLength("null"))

    println("\n*** End of exercise ***")
}


fun getLength(input: String?): Int = input?.length ?: -1