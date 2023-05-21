package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: Harry Potter
 * https://hyperskill.org/learn/step/4601
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Harry Potter ***")

    val userInput = readln()
    println(
        when (userInput) {
            "gryffindor" -> "bravery"
            "hufflepuff" -> "loyalty"
            else -> "not a valid house"
        }
    )

    println("\n*** End of exercise ***")
}