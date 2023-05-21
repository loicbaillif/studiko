package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: Harry Potter
 * https://hyperskill.org/learn/step/4601
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Harry Potter ***")

    println(
        when (readln()) {
            "gryffindor" -> "bravery"
            "hufflepuff" -> "loyalty"
            "ravenclaw" -> "intellect"
            "slytherin" -> "cunning"
            else -> "not a valid house"
        }
    )

    println("\n*** End of exercise ***")
}