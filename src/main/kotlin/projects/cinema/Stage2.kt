package projects.cinema

/**
 * Stage 2/5: Sold!
 * https://hyperskill.org/projects/138/stages/736/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val ASK_NB_ROWS = "Enter the number of rows:"
const val ASK_NB_SEATS = "Enter the number of seats in each row:"
const val LIM_NB_SEATs = 60
const val PRINT_INCOME = "Total income:\n"

fun stage2() {
    // Variables
    val nbRows = checkInputInt(ASK_NB_ROWS)
    val nbSeats = checkInputInt(ASK_NB_SEATS)
    println("$nbRows rows and $nbSeats seats per row") // DEBUG


}


fun calculateIncome(nbRows: Int, nbSeats: Int): Int {
    // Variables
    val totalSeats = nbRows * nbSeats

    return 1 // DEBUG
}


fun checkInputInt(prompt: String, default: Int = 1): Int {
    // This function print the prompt, then return user input as an Integer
    // If user input is not an integer, returns default value
    println(prompt)
    val userInputString = readln()

    for (ch in userInputString) {
        if (ch !in '0'..'9') return default
    }

    return userInputString.toInt()
}