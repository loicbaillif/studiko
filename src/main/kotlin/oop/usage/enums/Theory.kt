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

    println("\n***** End of Theory *****")
}


enum class Rainbow (val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
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