package typesDataStruct.lists.introMut

/**
 * Exercise: Initializing a mutable list of characters
 * https://hyperskill.org/learn/daily/14885
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Initializing a mutable list of characters ***")

    val characters = mutableListOf('a', 'z', 'e', 'd')
    println(characters.joinToString())

    println("\n*** End of exercise ***")
}