package typesDataStruct.basicOps.intAction

/**
 * Exercise: Time format
 * https://hyperskill.org/learn/daily/15729#comment
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Time format ***")

    val totalSeconds = System.currentTimeMillis() / 1000
    val secondsPerDay = 3600 * 24
    val todaySeconds = totalSeconds % secondsPerDay
    val hours = todaySeconds / 3600
    val minutes = (todaySeconds / 60) % 60
    val seconds = todaySeconds % 60
    println(seconds)


    println("\n*** End of exercise ***")
}