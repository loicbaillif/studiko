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
    println(lines)

    val fileName2 = "src/main/kotlin/addit/files/readFiles/reading2.txt"
    val file = File(fileName2)
    if (file.exists()) {
        // Checks file existence
        val lines2 = file.readText()
        println(lines2)
    } else {
        print("Thanks for the offer, but I'll have to pass. Your file was not found.")
    }


    println("\n***** End of Theory *****")
}