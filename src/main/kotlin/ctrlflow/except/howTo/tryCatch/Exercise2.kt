package ctrlflow.except.howTo.tryCatch

/**
 * Exercise: Handling strings
 * https://hyperskill.org/learn/step/10626
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Handling Strings ***")



    println("\n*** End of exercise ***")
}


fun printFifthCharacter(input: String): String {
    try {
        return "The fifth character of the entered word is ${input[4]}"
    } catch (e: StringIndexOutOfBoundsException) {

    }
}