package ctrlflow.except.howTo.tryCatch

/**
 * Exercise: Handling strings
 * https://hyperskill.org/learn/step/10626
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Handling Strings ***")

    print(printFifthCharacter("1234"))

    println("\n*** End of exercise ***")
}


fun printFifthCharacter(input: String): String {
    return try {
        "The fifth character of the entered word is ${input[4]}"
    } catch (e: StringIndexOutOfBoundsException) {
        "The input word is too short!"
    }
}