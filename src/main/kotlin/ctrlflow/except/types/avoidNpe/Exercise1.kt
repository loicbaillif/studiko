package ctrlflow.except.types.avoidNpe

/**
 * Exercise: Check length
 * https://hyperskill.org/learn/step/7625
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Check length ***")

    val argument: String = readln()
    println(check(argument)?.length ?: 0)

    println("\n*** End of exercise ***")
}


fun check(name: String): String? {
    return if (name.length > 5) null else name
}