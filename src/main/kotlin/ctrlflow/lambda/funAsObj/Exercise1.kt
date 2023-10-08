package ctrlflow.lambda.funAsObj

/**
 * Exercise: Function generator
 * https://hyperskill.org/learn/step/6000
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Function generator ***")

    val testFun = generate(readln())
    println(testFun(8))

    println("\n*** End of exercise ***")
}

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    return when (functionName) {
        "half" -> ::half
        "identity" -> ::identity
        "zero" -> ::zero
        else -> ::zero
    }
}


fun half(input: Int) = input / 2

fun identity(input: Int) = input

fun zero(input: Int) = 0