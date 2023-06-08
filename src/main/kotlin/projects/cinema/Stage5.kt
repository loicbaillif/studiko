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
    var nbTicketsSold = 0
    var percentage = 0
    var currentIncome = 0
    var totalIncome = 0

    displayCinemaList(cinemaList) // DEBUG
    println(String.format(STATISTICS, 3, 3.21, 5, 333)) // DEBUG
}