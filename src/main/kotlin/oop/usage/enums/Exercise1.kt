package oop.usage.enums

/**
 * Exercise: Currencies
 * https://hyperskill.org/learn/step/6252
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Currencies ***")

    val someMoney = Currency.GBP
    println(someMoney.name)

    println("\n*** End of exercise ***")
}


enum class Currency {
    CAD,
    CNY,
    EUR,
    GBP,
    JPY,
    KZT,
    RUB,
    UAH,
    USD;
}