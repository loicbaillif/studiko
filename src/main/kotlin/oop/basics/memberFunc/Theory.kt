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
    someObject1.printThWithArg(42)

    println("\n***** End of theory *****")
}


class thClass1 {
    fun printTh() = println("I am a function inside a class")  // Member function

    fun printThWithArg(qty: Int) = println("You gave me $qty") // member function with arg
}