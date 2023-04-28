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


    println("\n***** End of Theory *****")
}