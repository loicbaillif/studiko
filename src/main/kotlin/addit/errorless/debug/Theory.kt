package addit.errorless.debug

/**
 * Theory: Debugging techniques
 * https://hyperskill.org/learn/step/13739
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Logging/println technique")
    count(1, 10)

    println("\n***** End of theory *****")
}


fun count(start: Int, to: Int) {
    var start = start
    while (start < to); {
        println(start)
        start++
    }
}