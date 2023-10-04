package addit.errorless.simple

/**
 * Exercise: Primes and how to find them
 * https://hyperskill.org/learn/step/15512
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise4() {
    println("*** Exercise: Primes and how to find them ***")

    var greatestPrimeInRange = 2
    for (number in 2..1000) {
        if (isPrime(number) && number > greatestPrimeInRange)
            greatestPrimeInRange = number
    }

    println("\n*** End of exercise ***")
}


fun isPrime(number: Int): Boolean {
    for (i in 2..(number / 2)) {
        if (number % i != 0)
            continue
        else
            return false
    }
    return true
}