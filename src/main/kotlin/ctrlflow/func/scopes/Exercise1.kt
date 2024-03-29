package ctrlflow.func.scopes

/**
 * Exercise: Cyclist
 * https://hyperskill.org/learn/step/17124
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Cyclist ***")

    var distance = readln().toInt() // the distance back
    var totalDistance = readln().toInt()

    // fix the code below
    if (distance < 0) {
        distance = -distance
    }
    totalDistance += distance
    println(totalDistance)

    println("\n*** End of exercise ***")
}