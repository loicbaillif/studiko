package projects.cinema

/**
 * Stage 5/5: Errors!
 * https://hyperskill.org/projects/138/stages/739/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage5() {
    // Variables
    val cinemaList = createCinema()

    displayCinemaList(cinemaList) // DEBUG
    println(String.format(STATISTICS, nbTicketsSold, percentage, currentIncome, totalIncome)) // DEBUG
}