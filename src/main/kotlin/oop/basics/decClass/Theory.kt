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
    val thPatient1 = thPatient()
    println("patient1.name = ${thPatient1.name}")
    println("patient1.age = ${thPatient1.age}")
    println("patient1.height = ${thPatient1.height}")

    println("\n*** 3) Changing properties")
    val andyPatient = thPatient()
    andyPatient.name = "Andy Arendal"
    andyPatient.age = 31
    andyPatient.height = 1.84
    println("${andyPatient.name}: ${andyPatient.age} years old - ${andyPatient.height} m.")


    println("\n***** End of theory *****")
}