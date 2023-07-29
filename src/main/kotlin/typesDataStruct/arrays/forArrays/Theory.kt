package typesDataStruct.arrays.forArrays

/**
 * Theory: for loop and arrays
 * https://hyperskill.org/learn/step/4657
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** Iterating through an array")
    val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in daysOfWeek) {
        println("\t. $day")
    }

    println("\n***** End of theory *****")
}