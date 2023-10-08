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

}


fun identity(input: Int) = input

fun half(input: Int) = input / 2

fun zero(input: Int) = 0