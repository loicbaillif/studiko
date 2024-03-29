package ctrlflow.func.defaultArgs

/**
 * Exercise: Calculate volume
 * https://hyperskill.org/learn/daily/4708
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Calculate volume ***")

    println(getVolume(3))

    println("\n*** End of exercise ***")
}


fun getVolume(length: Int, width: Int = 1, height: Int = 1): Int = length * width * height