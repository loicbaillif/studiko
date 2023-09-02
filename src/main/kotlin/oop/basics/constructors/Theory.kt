package oop.basics.constructors

/**
 * Theory: Constructors
 * https://hyperskill.org/learn/step/10740
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Default Constructor")
    val size1 = Size1()

    println("\n***** End of theory *****")
}


class Size1 {
    var width: Int = 1
    var height: Int = 1
}