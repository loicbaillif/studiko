package projects.cinema

/**
 * Stage3/5: Tickets
 * https://hyperskill.org/projects/138/stages/737/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage3() {
    // Variables
    val cinemaList = createCinema()

    // Body
    displayCinemaList(cinemaList)
    val ticketRow = checkInputInt(ASK_TICKET_ROW)
    val ticketSeat = checkInputInt(ASK_TICKET_SEAT)
    println("\n$TICKET_PRICE${giveTicketPrice(cinemaList, ticketRow, ticketSeat)}")
    displayCinemaList(cinemaList)
}