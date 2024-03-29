package projects.cinema


const val LIM_NB_SEATS = 60
const val PRICE_HIGH = 10
const val PRICE_LOW = 8
const val SEAT_EMPTY = 'S'.code
const val SEAT_BOOKED = 'B'.code
const val ASK_NB_ROWS = "Enter the number of rows:"
const val ASK_NB_SEATS = "Enter the number of seats in each row:"
const val ASK_TICKET_ROW = "Enter a row number:"
const val ASK_TICKET_SEAT = "Enter a seat number in that row:"
const val MAIN_MENU = """
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit"""
const val OCCUPIED_SEAT = "That ticket has already been purchased!\n"
const val PRINT_INCOME = "Total income:\n"
const val STATISTICS = "Number of purchased tickets: %d\nPercentage: %.2f%%\nCurrent income: $%d\nTotal income: $%d"
const val TICKET_PRICE = "\nTicket price: $"
const val WRONG_INPUT = "Wrong input!"

