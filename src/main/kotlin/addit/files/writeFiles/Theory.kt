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
    val textFile1 = File("data/textFile1.txt")
    textFile1.writeText("I want to break free")



    println("\n\n***** End of theory *****")
}