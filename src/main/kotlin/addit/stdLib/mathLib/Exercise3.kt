package addit.stdLib.mathLib

import kotlin.math.sqrt

/**
 * Exercise: Heron's Formula
 * https://hyperskill.org/learn/step/4562
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Heron's formula ***")

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val p = ((a + b + c) / 2).toDouble()

    println(sqrt(p * (p - a) * (p - b) * (p - c)))

    println("\n*** End of exercise ***")
}