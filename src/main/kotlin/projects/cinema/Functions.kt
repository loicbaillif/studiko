package projects.cinema


const val S_AS_INT = 'S'.code
const val B_AS_INT = 'B'.code

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
    nbRows: Int, nbSeatsPerRow: Int): MutableList<MutableList<Int>> {
    // Create the cinema room as a 2D list, with following characteristics:
    // List of (nbRows + 1) lists
    // . First list made of [nbRows, nbSeats, totalSeats]
    // . Other lists represent the seats

    // Variables
    val headerList = mutableListOf<Int>(nbRows, nbSeatsPerRow, nbRows * nbSeatsPerRow)
    val cinemaRoom: MutableList<MutableList<Int>> = mutableListOf(headerList)
    // val seatRow = MutableList(nbSeatsPerRow + 1) { S_AS_INT }
    // for (i in 1..nbSeatsPerRow) seatRow.add('S')

    for (i in 1..nbRows) {
        cinemaRoom += MutableList(nbSeatsPerRow + 1) { S_AS_INT }
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
    print("Cinema:\n  ")
    for (i in 1..nbSeatsPerRow) print("$i ") // Header
    println()
    for (i in 1..nbRows) {
        // println(cinema[i].map {it.toChar() }.joinToString(" "))
        for (j in 1..nbSeatsPerRow) {
            print(if (j == 1) j else j.toChar())
        }
    }
}


fun giveTicketPrice (
    cinema: MutableList<MutableList<Int>>,
    rowNumber: Int,
    seatNumber: Int): Int {
    // Variables
    val nbRows = cinema[0][0].toString().toInt()
    val totalSeats = cinema[0][2].toString().toInt()

    updateCinema(cinema, rowNumber, seatNumber)

    if (totalSeats <= LIM_NB_SEATS) return PRICE_HIGH // Small Room

    return (if (rowNumber <= nbRows / 2)  PRICE_HIGH else PRICE_LOW) // Big Room
}


fun updateCinema (cinema: MutableList<MutableList<Int>>, rowNumber: Int, seatNumber: Int): Boolean {
    if (cinema[rowNumber][seatNumber] == S_AS_INT) {
        cinema[rowNumber][seatNumber] = B_AS_INT
        println("Place bought") // DEBUG
        return true
    }

    return false
}