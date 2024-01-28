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
    myFunctionTh(6)


    println("\n*** 3) Catching custom Exceptions")
    try {
        myFunctionTh(-16)
    } catch (e: LessThanZero) {
        println("\t. Less than -10 exception thrown")
    } catch (e: LessThanZeroButOneDigit) {
        println("\t. Negative number, but one digit only")
    }


    println("\n*** 4) Multiple constructors")
    val userInput = -5
    try {
        when (userInput) {
            1 -> throw MyCustomExceptionTh()
            2 -> throw MyCustomExceptionTh("Value 2 detected, exception")
            -5 -> throw MyCustomExceptionTh(LessThanZeroButOneDigit())
            4 -> throw MyCustomExceptionTh("Both message and exception", GreaterThanTen())
            else -> println("No exception here ... Carry on.")
        }
    } catch (e: MyCustomExceptionTh) {
        println("Exception = [${e.cause?: "no cause"}]: [${e.message?: "no message"}]")
    }



    println("\n***** End of theory *****")
}


fun myFunctionTh(userInput: Int) {
    if (userInput > -10 && userInput < 0) throw LessThanZeroButOneDigit()
    if (userInput < 0) throw LessThanZero()
    if (userInput > 10) throw GreaterThanTen()
    if (userInput == 5) throw MyExceptionTh()

    println("\t. No exception thrown")
}


fun testFunTh(a: Int, b: Int): Int {
    return a / b
}


open class LessThanZero: Exception("Parameter less than zero")

class LessThanZeroButOneDigit: LessThanZero()

class GreaterThanTen: Exception("Parameter greater than ten")

class MyExceptionTh: ArithmeticException("Same type than ArithmeticException")


class MyCustomExceptionTh: Exception {
    constructor() : super()  // No parameters
    constructor(message: String?) : super(message)
    constructor(cause: Throwable?) : super(cause)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
}