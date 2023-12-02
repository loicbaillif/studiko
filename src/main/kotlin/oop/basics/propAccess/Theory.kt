package oop.basics.propAccess

/**
 * Theory: Property Accessors
 * https://hyperskill.org/learn/step/10511
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("*** 1) Property getter")
    val client1 = Client1()
    println(client1.name)


    println("\n***** End of theory *****")
}


class Client1 {
    val name = "Unknown"
}


class IntegerRepository1 {
    private val _list = mutableListOf<Int>(36, 10, 59, 97)
    val list: List<Int> get() = _list
}