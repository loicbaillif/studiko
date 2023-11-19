package addit.stdLib.mathLib

import kotlin.math.max

/**
 * Exercise: Max of four numbers
 * https://hyperskill.org/learn/step/4621
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Max of four numbers ***")

    val (a, b, c, d) = List(4) { readln().toInt() }
    val max1 = max(a, b)
    val max2 = max(c, d)

    println("\n*** End of exercise ***")
}