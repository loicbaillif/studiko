package addit.files.readFiles

import java.io.File

/**
 * Count the numbers
 * https://hyperskill.org/learn/step/6358
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Count the numbers ***")

    val filename = "data/words_with_numbers.txt"
    val fileLines = File(filename).readLines()

    for (line in fileLines) {
        for (ch in line) {

        }
    }

    println("\n*** End of exercise ***")
}