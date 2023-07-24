package addit.errorless.errors

/**
 * Errors in programs - Theory
 * https://hyperskill.org/learn/step/11559
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Compile-time errors")
    println("Hello there!")

    println("\n*** 2) Run-time errors")
    var userInput = 1
    while (userInput != 0) {
        println("Menu:\n\t. 1 -> print hello\n\t. 2 -> end program")
        userInput = readln().toInt()
        if (userInput == 2) break
    }


    println("\n***** End of theory *****")
}