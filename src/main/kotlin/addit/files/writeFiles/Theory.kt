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



    println("\n\n***** End of theory *****")
}