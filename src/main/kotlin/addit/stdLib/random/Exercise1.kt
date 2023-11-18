package addit.stdLib.random

import kotlin.random.Random

/**
 * RPG dices
 * https://hyperskill.org/learn/step/27075
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: RPG dices ***")

    val dice1Size = readln().toInt()
    val dice2Size = readln().toInt()
    println(rpgDices(dice1Size, dice2Size))

    println("\n*** End of exercise ***")
}

fun rpgDices(dice1: Int, dice2: Int): Int {
    val dice1Result = Random.nextInt(1, dice1)
    val dice2Result = Random.nextInt(1, dice2)

    return dice1Result + dice2Result
}
