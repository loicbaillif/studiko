package ctrlflow.func.scopes

/**
 * Exercise: Power and scopes
 * https://hyperskill.org/learn/step/17121
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Power and Scopes ***")
    var thirteen = 13L

    for (i in 2..10) {
        thirteen *= 13
        println(thirteen)
    }

    println("\n*** End of exercise ***")
}