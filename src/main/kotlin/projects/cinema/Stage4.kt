package projects.cinema

/**
 * Stage 4/5: Menu, please
 * https://hyperskill.org/projects/138/stages/738/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    // Variables
    val cinemaList = createCinema(
        checkInputInt(ASK_NB_ROWS),
        checkInputInt(ASK_NB_SEATS)
    )
    var exitCondition = false
    var userChoice = 1

    while (!exitCondition) {
        userChoice = checkInputInt(MAIN_MENU, 1)
        if (userChoice == 0) exitCondition = true
    }
}