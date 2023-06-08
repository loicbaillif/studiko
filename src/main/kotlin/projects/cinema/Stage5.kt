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
    var exitCondition = false

    while (!exitCondition) {
        // Variable

        getMainMenu()

        println("User choice = $userChoice") // DEBUG
    }

    displayCinemaList(cinemaList) // DEBUG
    displayStatistics() // DEBUG
}