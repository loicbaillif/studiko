package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: Just checking
 * https://hyperskill.org/learn/step/4602
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val JAVA = "1"
const val KOTLIN = "2"
const val SCALA = "3"
const val PYTHON = "4"

fun exercise4() {
    println("*** Exercise: Just checking ***")

    val userInput = readln()
    println(
        when (userInput) {
            KOTLIN -> "Yes!"
            JAVA, PYTHON, SCALA -> "No!"
            else -> "Unknown number"
        }
    )

    println("\n*** End of exercise ***")
}