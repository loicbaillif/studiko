package addit.stdLib.mathLib

import kotlin.math.*

/**
 * Exercise: Sine and cosine
 * https://hyperskill.org/learn/step/4619
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Sine and cosine ***")

    val userAngle = readln().toDouble()
    println(sin(userAngle) - cos(userAngle))

    println("\n*** End of exercise ***")
}