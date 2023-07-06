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
        println("Thanks for the offer, but I'll have to pass. Your file was not found.")
    }
    val file3 = File(fileName)
    println("\t. File length: ${file3.length()}")
    println(file3.absolutePath)


    println("\n*** 2) readLines")
    val lines3 = File(fileName).readLines()
    for (line in lines3) {
        println("\t. ${line.padEnd(30, '*')}")
    }


    println("\n*** 3) readBytes")
    val lines4 = File(fileName).readBytes()
    for (line in lines4) println("\t. $line")


    println("\n*** 4) forEachLine")
    println("Recommended method for reading large files")
    File(fileName).forEachLine { println("\t. $it") }


    println("\n\n***** End of Theory *****")
}