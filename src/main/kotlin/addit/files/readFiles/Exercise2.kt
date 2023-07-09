package addit.files.readFiles

import java.io.File

/**
 * The longest word
 * https://hyperskill.org/learn/step/6356
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: The longest word ***")

    val fileName = "data/words_sequence.txt"
    val lines = File(fileName).readLines()
    var longestWord = 0

    for (line in lines) {
        if (line.length > longestWord) { longestWord = line.length }
    }

    println(longestWord)

    println("\n*** End of exercise ***")
}