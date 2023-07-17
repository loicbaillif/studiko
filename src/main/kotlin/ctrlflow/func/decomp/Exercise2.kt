package ctrlflow.func.decomp

/**
 * Create a full name
 * https://hyperskill.org/learn/daily/12674
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise2() {
    println("*** Exercise: Create a full name ***")

    println(createFullName("John", "Lennon"))

    println("\n*** End of exercise ***")
}


fun createFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}