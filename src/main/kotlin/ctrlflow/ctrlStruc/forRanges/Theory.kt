package ctrlflow.ctrlStruc.forRanges

/**
 * https://hyperskill.org/learn/step/4652
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) For loop")
    println("Example 1:")
    for (i in 1..4) {
        println("\t. $i")
    }

    println("\nExample 2:")
    for (ch in 'a'..'d') println("\t. $ch")

    println("\n*** 2) Iterating through a String")
    val someString = "Serendipity"
    for (ch in someString) println("\t. $ch")

    println("\n*** 3) Iterating in the backward order")
    for (i in 7 downTo 2) println("\t. $i")

    println("\n*** 4) Excluding the upper limit")
    println("Use 1 until 4 instead of 1..4 will loop from 1 to 3 (included)")
    for (i in 1 until 4) println("\t. $i")

    println("\n*** 5) Specifying a step")
    println("for (i in 3..10 step 2) { ... }")
    for (i in 3..10 step 2) println("\t. $i")
    print("works as well in reverse order: ")
    println("for (i in 10 downTo 3 step 3 { ... }")
    for (i in 10 downTo 3 step 3) println("\t. $i")

    println("\n*** 6) Example: factorial of a number")
    println("Please enter a number between 1 and 15")
    var userInput = readln().toInt()
    if (userInput !in 1..15) {
        userInput = 0
        println("Input out of bounds, replaced by 0")
    }
    var result = 1
    for (i in 2..userInput) result *= i
    println("$userInput! = $result")


    println("\n***** End of Theory *****")
}