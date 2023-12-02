package oop.usage.enums

/**
 * Exercise: Ordinal property
 * https://hyperskill.org/learn/step/6250
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Ordinal property ***")



    println("\n*** End of exercise ***")
}


enum class Rainbow2(val colorName: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet"),
    NULL("");
}


fun findByName(name: String): Rainbow2 {
    for (color in Rainbow2.values()) {
        if (name == color.colorName) return color
    }
    return Rainbow2.NULL
}


fun testFun() {
    val color = findByName("Black")
    println(color.ordinal)
}