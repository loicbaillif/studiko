package oop.usage.enums

/**
 * Theory: Enum
 * https://hyperskill.org/learn/step/6245
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Basic enum")
    val color1 = Rainbow.BLUE.color
    val status1 = Status.IN_PROGRESS.status
    val material1 = Materials.PLASTIC.material

    val color2 = Rainbow.RED
    color2.printFullInfo()

    println("\n*** 2) Inside enum")
    println(color2.name)
    println(color2.ordinal)
    println(isRainbow(color1))
    println(isRainbow("Black"))

    println(findByRgb("#00AD00"))
    println(findByRgb("#00FF00"))


    println("\n***** End of Theory *****")
}


fun findByRgb(rgb: String): Rainbow {
    for (rainbowColour in Rainbow.values()) {
        if (rainbowColour.rgb == rgb) return rainbowColour
    }
    return Rainbow.NULL
}


fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color.uppercase() == enum.name) return true
    }
    return false
}


enum class Rainbow (val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "8B00FF"),
    NULL("", "");

    fun printFullInfo() {
        println("Color - $color => RGB = $rgb")
    }
}


enum class Status (val status: String) {
    OPEN ("pen"),
    PENDING("pending"),
    IN_PROGRESS("in progress"),
    RESOLVED("resolved"),
    REJECTED("rejected"),
    CLOSED("closed")
}


enum class Materials (val material: String) {
    CONCRETE("concrete"),
    GLASS("glass"),
    WOOD("wood"),
    FABRIC("fabric"),
    METAL("metal"),
    PLASTIC("plastic"),
    ROCK("rock")
}