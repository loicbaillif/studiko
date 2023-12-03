package oop.usage.enums

/**
 * Exercise: Danger level
 * https://hyperskill.org/learn/step/6251
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise3() {
    println("*** Exercise: Danger level ***")

    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel())

    println("\n*** End of exercise ***")
}


enum class DangerLevel (val levelName: String, val levelValue: Int) {
    HIGH("High", 3),
    MEDIUM("Medium", 2),
    LOW("Low", 1);

    fun getLevel(): Int = levelValue
}