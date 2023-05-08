package typesDataStruct.lists.forLoop

/**
 * Exercise: Individual Taxes
 * https://hyperskill.org/learn/step/15027
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Individual Taxes ***")

    // Init variables
    val nbCompanies = readln().toInt()
    val listIncomes = mutableListOf<Int>()
    val listTaxRates = mutableListOf<Int>()
    val listTaxes = mutableListOf<Int>()

    // Fill lists
    for (index in 1..nbCompanies) {
        listIncomes.add(readln().toInt())
    }
    for (index in 1..nbCompanies) {
        listTaxRates.add(readln().toInt())
    }

    // Get the total taxes
    for (index in 0 until nbCompanies) {
        listTaxes.add(listIncomes[index] * listTaxRates[index])
    }

    println(listTaxes.indexOf(listTaxes.maxOrNull()) + 1)

    println("\n*** End of exercise ***")
}