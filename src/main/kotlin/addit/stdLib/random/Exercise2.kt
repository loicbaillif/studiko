package addit.stdLib.random

import kotlin.random.Random

/**
 * Predictable "random" password
 * https://hyperskill.org/learn/step/11806
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Predictable \"random\" password")

    println(generatePredictablePassword(53))


    println("\n*** End of exercise ***")
}


fun generatePredictablePassword(seed: Int): String {
    var randomPassword = ""
    val passwordSize = 10
    val randomGeneratorFriend = Random(seed)

    repeat(passwordSize) {
        randomPassword += randomGeneratorFriend.nextInt(33, 127).toChar()
    }

    return randomPassword
}