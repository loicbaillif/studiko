package projects.cinema

/**
 * Stage3/5: Tickets
 * https://hyperskill.org/projects/138/stages/737/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage3() {
    // Variables
    val nbRows = checkInputInt(ASK_NB_ROWS)
    val nbSeats = checkInputInt(ASK_NB_SEATS)
    val cinemaList = createCinema(nbRows, nbSeats)

    // Body
    displayCinemaList(cinemaList)
    println(cinemaList) // DEBUG
    val ticketRow = checkInputInt(ASK_TICKET_ROW)
    val ticketSeat = checkInputInt(ASK_TICKET_SEAT)
    println(giveTicketPrice(cinemaList, ticketRow, ticketSeat))
    println(cinemaList) // DEBUG
}