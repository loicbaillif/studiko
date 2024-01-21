package ctrlflow.func.scopes

/**
 * Exercise: Power and scopes
 * https://hyperskill.org/learn/step/17121
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Power and Scopes ***")

    for (i in 2..10) {
        var thirteen = 13L
        thirteen *= 13
        println(thirteen)
    }

    println("\n*** End of exercise ***")
}