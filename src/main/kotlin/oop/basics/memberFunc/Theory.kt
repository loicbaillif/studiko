package oop.basics.memberFunc

/**
 * Member functions: Theory
 * https://hyperskill.org/learn/step/6364
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    val someObject1: thClass1 = thClass1()
    someObject1.printTh()

    println("\n***** End of theory *****")
}


class thClass1 {
    fun printTh() = println("I am a function inside a class")  // Member function
}