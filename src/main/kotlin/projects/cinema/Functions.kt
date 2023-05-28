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


fun createCinema(
    nbRows: Int, nbSeatsPerRow: Int): MutableList<MutableList<out Any>> {
    // Create the cinema room as a 2D list, with following characteristics:
    // List of (nbRows + 1) lists
    // . First list made of [nbRows, nbSeats, totalSeats]
    // . Other lists represent the seats

    // Variables
    val rowList = MutableList(nbSeatsPerRow) { 'S' }
    val roomList = MutableList(nbRows) { rowList }
    val headerList = mutableListOf<Int>(nbRows, nbSeatsPerRow, nbRows * nbSeatsPerRow)

    return mutableListOf(
        headerList,
        roomList
    )
}


fun displayCinema(nbRows: Int, nbSeats: Int) {
    print("Cinema:\n  ")
    for (i in 1..nbSeats) {
        print("$i ")
    }
    println()

    for (i in 1..nbRows) {

        for (j in 0..nbSeats) {
            print(if (j == 0) "$i " else "S ")
        }
        println()
    }
}


fun displayCinemaList(cinema: MutableList<MutableList<out Any>>) {
    // Will create the cinema room as a 2D mutable list
    // First dimension: number of rows - second dimension: seats per row

    // Variables
    val nbRows = cinema[0][0].toString().toInt()
    val nbSeatsPerRow = cinema[0][1].toString().toInt()
    println("nbRows = $nbRows - ${nbRows::class.simpleName}")

    displayCinema(nbRows, nbSeatsPerRow)
}


fun giveTicketPrice (
    cinema: MutableList<MutableList<out Any>>,
    rowNumber: Int,
    seatNumber: Int): Int {
    // Variables
    val nbRows = cinema[0][0].toString().toInt()
    val totalSeats = cinema[0][2].toString().toInt()

    if (totalSeats <= LIM_NB_SEATS) return PRICE_HIGH // Small Room

    return (if (rowNumber <= nbRows / 2)  PRICE_HIGH else PRICE_LOW) // Big Room
}