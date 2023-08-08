package oop.basics.decClass

/**
 * Theory: Declaring Classes
 * https://hyperskill.org/learn/step/6200
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Object creation")
    val object1 = thClass()

    println("\n*** 2) Accessing properties")
    var thPatient1 = thPatient()
    println("patient1.name = ${thPatient1.name}")
    println("patient1.age = ${thPatient1.age}")
    println("patient1.height = ${thPatient1.height}")


    println("\n***** End of theory *****")
}