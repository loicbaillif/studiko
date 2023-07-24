package projects.cinema

/**
 * Stage 2/5: Sold!
 * https://hyperskill.org/projects/138/stages/736/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */



fun stage2() {
    // Variables
    val nbRows = checkInputInt(ASK_NB_ROWS)
    val nbSeats = checkInputInt(ASK_NB_SEATS)

    println("$PRINT_INCOME\$${calculateIncome(nbRows, nbSeats)}")
}