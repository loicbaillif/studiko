package oop.basics.propAccess

/**
 * Exercise: Custom Getter
 * https://hyperskill.org/learn/step/7367
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Custom Getter ***")

    val smartOne = Smartphone1("Ericsong")
    smartOne.price = -24
    val smartTwo = Smartphone1("iNokhe")
    print(smartTwo.price - smartOne.price)

    println("\n*** End of exercise ***")
}


class Smartphone1(val name: String) {
    var price: Int = -5
        get() = name.length - field
}