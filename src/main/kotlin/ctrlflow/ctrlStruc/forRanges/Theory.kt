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


    println("\n***** End of Theory *****")
}