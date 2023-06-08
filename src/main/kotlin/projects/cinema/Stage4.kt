package projects.cinema

/**
 * Stage 4/5: Menu, please
 * https://hyperskill.org/projects/138/stages/738/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    // Variables
    val cinemaList = createCinema()
    var exitCondition = false

    while (!exitCondition) {
        // Variables
        val userChoice = checkInputInt(MAIN_MENU, 1)

        // Treat user choice
        when (userChoice) {
            1 -> displayCinemaList(cinemaList)
            2 -> sellTicket(cinemaList)
        }

        // Exit condition
        if (userChoice == 0) exitCondition = true
    }
}