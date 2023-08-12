package ctrlflow.func.namedArgs

/**
 * Theory: Named Arguments
 * https://hyperskill.org/learn/step/4640
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Improving code readability")
    val amount1 = calcEndDayAmount(1000, 10, 500)
    val amount2 = calcEndDayAmount(
        startCash = 1000,
        ticketPrice = 10,
        nbTickets = 500
    )


    println("\n*** 2) Reordering arguments")
    val amount3 = calcEndDayAmount(
        ticketPrice = 10,
        nbTickets = 500,
        startCash = 1000
    )
    println(amount1 == amount2)
    println(amount1 == amount3)


    println("\n***** End of theory *****")
}


fun calcEndDayAmount(startCash: Int, ticketPrice: Int, nbTickets: Int) = startCash + nbTickets * ticketPrice