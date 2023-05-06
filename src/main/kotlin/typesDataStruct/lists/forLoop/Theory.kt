package typesDataStruct.lists.forLoop

/**
 * for loop and lists - Theory
 * https://hyperskill.org/learn/step/15022
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Iterating through a MutableList")
    val daysOfWeek = mutableListOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    for (day in daysOfWeek) {
        println("\t. $day")
    }

    println("\n*** 2) Iterating by indexes")
    for (index in daysOfWeek.indices) {
        println("\t. $index: ${daysOfWeek[index]}")
    }

    println("\n*** 3) Iterating by range indexes")
    for (index in 0..4) {
        println("\t. $index: ${daysOfWeek[index]}")
    }

    println("\n***** End of theory *****")
}