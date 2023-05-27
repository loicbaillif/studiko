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