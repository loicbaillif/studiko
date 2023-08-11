package ctrlflow.func.defaultArgs

/**
 * Theory: Default Arguments
 * https://hyperskill.org/learn/step/4637
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Functions with default arguments")
    printQuote("I want to break free")
    printQuote("Hello", "!!!\n")
    printQuote()


    println("\n*** 2) Mixing default and regular arguments")




    println("\n***** End of theory *****")
}


fun printQuote(line: String = "\t\"", end: String = "\"\n") = print("$line$end")


fun findMax(n1: Int, n2: Int, absolute: Boolean = false): Int {

}