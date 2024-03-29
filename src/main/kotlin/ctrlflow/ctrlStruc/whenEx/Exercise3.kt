package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: The army of units
 * https://hyperskill.org/learn/step/4610
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: The army of units ***")

    println(
        when(readln().toInt()) {
            in Int.MIN_VALUE..0 -> "no army"
            in 1..4 -> "few"
            in 5..9 -> "several"
            in 10..19 -> "pack"
            in 20..49 -> "lots"
            in 50..99 -> "horde"
            in 100..249 -> "throng"
            in 250..499 -> "swarm"
            in 500..999 -> "zounds"
            else -> "legion"
        }
    )

    println("\n*** End of exercise ***")
}