package addit.errorless.simple

/**
 * Theory: Debugging Simple Constructs
 * https://hyperskill.org/learn/step/15503
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) If expressions")
    var greeting = "Hi, world"
    if (greeting.contains('e')) {
        greeting += "!"
        println(greeting)
    }
    println("Shutting down...")

    println("\n***** End of theory *****")
}