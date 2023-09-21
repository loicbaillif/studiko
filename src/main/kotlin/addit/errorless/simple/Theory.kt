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

    println("\n*** 2) Loops")
    val rangeStart = 'A'
    val rangeEnd = 'Z'
    val findLetter = 'Q'
    for (c in rangeStart..rangeEnd) {
        if (c == findLetter) {
            println("Character $c is is within range $rangeStart-$rangeEnd")
            return
        }
    }

    println("\n***** End of theory *****")
}