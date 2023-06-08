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
    var userChoice = -1

    while (!exitCondition) {
        // Variable
        do {
            userChoice = checkInputInt(MAIN_MENU, -1)
        } while (userChoice !in 0..3)
        println("User choice = $userChoice")
    }

    displayCinemaList(cinemaList) // DEBUG
    displayStatistics() // DEBUG
}