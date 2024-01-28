package ctrlflow.except.types.createCustom

import kotlin.Exception

/**
 * Creating custom exceptions: Theory
 * https://hyperskill.org/learn/step/15011
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Throwing an exception")

    /*
    println("Do you want an explicit exception?\n\t1 = true\t0 = false")
    val userRequest = readln().toInt()
    if (userRequest == 0) {
        throw Exception()
    } else {
        throw Exception("This is the reason why.")
    }
     */

    try {
        testFunTh(1, 2)
    } catch (e: Exception) {
        throw Exception("testFunTh() failed", e)
    }

    // throw NullPointerException("NPE at Alpha point")


    println("\n*** 2) Creating custom Exceptions")
    myFunctionTh(5)


    println("\n***** End of theory *****")
}


fun myFunctionTh(userInput: Int) {
    if (userInput < 0) throw LessThanZero()
    if (userInput > 10) throw GreaterThanTen()
    if (userInput == 5) throw MyExceptionTh()

    println("\t. No exception thrown")
}


fun testFunTh(a: Int, b: Int): Int {
    return a / b
}


class LessThanZero: Exception("Parameter less than zero")

class GreaterThanTen: Exception("Parameter greater than ten")

class MyExceptionTh: ArithmeticException("Same type than ArithmeticException")