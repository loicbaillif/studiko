package typesDataStruct.basicOps.intAction

/**
 * Exercise: Time Difference
 * https://hyperskill.org/learn/step/4493
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise5() {
    println("*** Exercise: Time Difference ***")

    val fromHours = readln().toInt()
    val fromMinutes = readln().toInt()
    val fromSeconds = readln().toInt()
    val toHours = readln().toInt()
    val toMinutes = readln().toInt()
    val toSeconds = readln().toInt()

    val fromTotal = (fromHours * 60 + fromMinutes) * 60 + fromSeconds
    val toTotal = (toHours * 60 + toMinutes) * 60 + toSeconds

    println("\n*** End of exercise ***")
}