package projects.cinema

fun calculateIncome(nbRows: Int, nbSeats: Int): Int {
    // Variables
    val totalSeats = nbRows * nbSeats

    if (totalSeats <= LIM_NB_SEATS) {
        return totalSeats * PRICE_HIGH
    } else {
        val priceHigh = nbRows / 2 * PRICE_HIGH
        val priceLow = (nbRows / 2 + nbRows % 2) * PRICE_LOW
        return (priceHigh + priceLow ) * nbSeats
    }
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


fun createCinema(): MutableList<MutableList<Int>> {
    // Create the cinema room as a 2D list, with following characteristics:
    // List of (nbRows + 1) lists
    // . First list made of [nbRows, nbSeats, totalSeats]
    // . Other lists represent the seats

    // Variables
    var nbRows: Int
    do nbRows = checkInputInt(ASK_NB_ROWS, -1) while (nbRows == -1)

    var nbSeatsPerRow: Int
    do nbSeatsPerRow = checkInputInt(ASK_NB_SEATS, -1) while (nbSeatsPerRow == -1)

    val headerList = mutableListOf<Int>(nbRows, nbSeatsPerRow, nbRows * nbSeatsPerRow)
    val cinemaRoom: MutableList<MutableList<Int>> = mutableListOf(headerList)

    for (i in 1..nbRows) {
        cinemaRoom += MutableList(nbSeatsPerRow + 1) { SEAT_EMPTY }
        cinemaRoom[i][0] = i
    }

    return cinemaRoom
}


fun displayCinemaList(cinema: MutableList<MutableList<Int>>) {
    // Will create the cinema room as a 2D mutable list
    // First dimension: number of rows - second dimension: seats per row

    // Variables
    val nbRows = cinema[0][0].toString().toInt()
    val nbSeatsPerRow = cinema[0][1].toString().toInt()

    // Display
    print("\nCinema:\n  ")
    for (i in 1..nbSeatsPerRow) print("$i ") // Header
    println()
    for (i in 1..nbRows) {
        println("$i ${cinema[i].map {it.toChar() }.joinToString(" ").substring(2)}")
    }
    println()
}


fun displayStatistics(): Unit {
    println(String.format(STATISTICS,
        nbTicketsSold,
        percentage,
        currentIncome,
        totalIncome)
    )
}


fun getMainMenu(): Unit {

}


fun giveTicketPrice (
    cinema: MutableList<MutableList<Int>>, rowNumber: Int, seatNumber: Int
): Int {
    // Variables
    val nbRows = cinema[0][0].toString().toInt()
    val totalSeats = cinema[0][2].toString().toInt()

    updateCinema(cinema, rowNumber, seatNumber)

    if (totalSeats <= LIM_NB_SEATS) return PRICE_HIGH // Small Room

    return (if (rowNumber <= nbRows / 2)  PRICE_HIGH else PRICE_LOW) // Big Room
}


fun sellTicket (cinema: MutableList<MutableList<Int>>) {
    // Variables
    val price: Int
    var ticketRow = 1 // Init value
    var ticketSeat: Int
    var validSeat = false
    val nbRows = cinema[0][0]
    val totalSeats = cinema[0][2]

    // Loop
    while (!validSeat) {
        ticketRow = checkInputInt(ASK_TICKET_ROW)
        ticketSeat = checkInputInt(ASK_TICKET_SEAT)
        validSeat = updateCinema(cinema, ticketRow, ticketSeat)
    }

    // Output
    price = if (totalSeats <= LIM_NB_SEATS || (ticketRow <= nbRows / 2)) {
        PRICE_HIGH
    } else {
        PRICE_LOW
    }
    println("$TICKET_PRICE$price")
}


fun updateCinema (cinema: MutableList<MutableList<Int>>, rowNumber: Int, seatNumber: Int): Boolean {
    if (cinema[rowNumber][seatNumber] == SEAT_EMPTY) {
        cinema[rowNumber][seatNumber] = SEAT_BOOKED
        return true
    }

    return false
}