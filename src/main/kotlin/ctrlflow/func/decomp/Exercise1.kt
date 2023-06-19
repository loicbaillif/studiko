package ctrlflow.func.decomp

/**
 * Exercise: Calculator with four functions
 * https://hyperskill.org/learn/step/12673
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Calculator with four functions ***")



    println("\n*** End of exercise ***")
}


fun divideTwoNumbers(a: Long, b: Long) {
    try {
        println(a / b)
    } catch (divZero: ArithmeticException) {
        println("Division by 0!")
    }
}


fun multiplyTwoNumbers(a: Long, b: Long) = println(a * b)