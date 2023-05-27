package projects.cinema

/**
 * Stage 2/5: Sold!
 * https://hyperskill.org/projects/138/stages/736/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ASK_NB_ROWS = "Enter the number of rows:"
const val ASK_NB_SEATS = "Enter the number of seats in each row:"
const val PRINT_INCOME = "Total income:\n"

fun stage2() {
    // Variables
    println(ASK_NB_ROWS)
    val nbRows = readln().toInt()
    println(ASK_NB_SEATS)
    val nbSeats = readln().toInt()
}


fun checkInputInt(prompt: String, default: Int = 1): Int {
    // This function print the prompt, then return user input as an Integer
    // If user input is not an integer, returns default value
    println(prompt)
    val userInputString = readln()

    for (ch in userInputString) {
        if (ch !in '0'..'9') return default
    }

    return 1
}