package addit.errorless.simple

/**
 * Exercise: Divisors finding
 * https://hyperskill.org/learn/step/15511
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun isPrimeBis(number: Int): Boolean {
    for (i in 2..(number / 2)) {
        if (number % i != 0)
            continue
        else
            return false
    }
    return true
}

fun exercise5() {
    println("*** Exercise: Divisors finding ***")

    val result = isPrimeBis(5977)
    println(result)

    println("\n*** End of exercise ***")
}