package addit.files.writeFiles

import java.io.File

/**
 * Theory: Writing Files
 * https://hyperskill.org/learn/step/9710
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Writing files with writeText()")
    /**
     * First example: create a file
     * val textFile1 = File("data/textFile1.txt")
     * textFile1.writeText("I want to break free")
     */
    println(System.getProperty("user.dir")) // Get current directory
    println(File.separator) // Path separator (may change from a system to another)

    val fileName2 = "textFile2.txt"
    val separator = File.separator
    val folderForFiles = "${System.getProperty("user.dir")}${separator}data${separator}"
    val content1 = "Deutsches Zentrum für Luft und RaumFahrt"
    File("${folderForFiles}${fileName2}").writeText(content1)


    println("\n*** 2) Formatting and Processing")
    val content2 = "This is Ground Control\nto Major Tom\n\t5...\n\t4...\n\t3..."
    File("${folderForFiles}${fileName2}").writeText(content2)


    println("\n\n***** End of theory *****")
}