package oop.usage.enums

/**
 * Theory: Enum
 * https://hyperskill.org/learn/step/6245
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Basic enum")

    println("\n***** End of Theory *****")
}


enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}


enum class Status {
    OPEN, PENDING, IN_PROGRESS, RESOLVED, REJECTED, CLOSED
}


enum class Materials {
    CONCRETE, GLASS, WOOD, FABRIC, METAL, PLASTIC, ROCK
}