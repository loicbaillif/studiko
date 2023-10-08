package ctrlflow.lambda.funAsObj

/**
 * Exercise: Function generator
 * https://hyperskill.org/learn/step/6000
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Function generator ***")



    println("\n*** End of exercise ***")
}

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    when (functionName) {
        "half" -> return ::half
        "identity" -> return ::identity
        "zero" -> return ::zero
        else -> return ::zero
    }
}


fun half(input: Int) = input / 2

fun identity(input: Int) = input

fun zero(input: Int) = 0