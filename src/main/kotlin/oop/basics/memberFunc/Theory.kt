package oop.basics.memberFunc

import kotlin.random.Random

/**
 * Member functions: Theory
 * https://hyperskill.org/learn/step/6364
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    val someObject1 = thClass1()
    someObject1.printTh()
    someObject1.printThWithArg(42)

    val someObject2 = thClass2(123_456)
    someObject2.givePop()

    val someCat1 = Cat("Bada")
    repeat(5) {
        someCat1.say()
    }

    println("\n***** End of theory *****")
}


class thClass1 {
    fun printTh() = println("I am a function inside a class")  // Member function

    fun printThWithArg(qty: Int) = println("You gave me $qty") // member function with arg
}


class thClass2(var population: Int) {
    fun givePop() {
        println("You initiated me with a population of $population")
    }

    init {
        println("I am alive;")
    }
}


class Cat(val name: String) {
    init {
        println("$name has been summoned.")
    }

    // Initial status
    var sleeping: Boolean = false

    fun say() {
        if (sleeping) {
            println("zzZZzzz")
        } else {
            println("Meow")

            if (Random.nextDouble() < 0.7) sleeping = true
        }
    }

    fun wakeUp() {
        sleeping = false
    }
}