package addit.files.readFiles

import java.io.File

/**
 * Theory: Reading Files
 * https://hyperskill.org/learn/step/6351
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) read text")
    val fileName = "src/main/kotlin/addit/files/readFiles/reading.txt"
    val lines = File(fileName).readText()
    print(lines)


    println("\n***** End of Theory *****")
}