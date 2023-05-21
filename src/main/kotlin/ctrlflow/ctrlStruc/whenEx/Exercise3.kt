package ctrlflow.ctrlStruc.whenEx

/**
 * Exercise: The army of units
 * https://hyperskill.org/learn/step/4610
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: The army of units ***")

    val nbUnits = readln().toInt()
    println(
        when(nbUnits) {
            in Int.MIN_VALUE..0 -> "no army"
            in 1..4 -> "few"
            else -> "legion"
        }
    )

    println("\n*** End of exercise ***")
}