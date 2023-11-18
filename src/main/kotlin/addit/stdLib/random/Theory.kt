package addit.stdLib.random

import kotlin.random.Random

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Types of random numbers")
    println("\t. Random.nextInt() = ${Random.nextInt()}")
    println("\t. Random.nextLong() = ${Random.nextLong()}")
    println("\t. Random.nextFloat() = ${Random.nextFloat()}")
    println("\t. Random.nextDouble() = ${Random.nextDouble()}")
    println("\t. Random.nextDouble() = ${Random.nextDouble()}")


    println("\n*** 2) Custom Ranges")
    println("\t. Random.nextInt(100) = ${Random.nextInt(100)}") // int in [0, 100[
    println("\t. Random.nextInt(10, 100) = ${Random.nextInt(10, 100)}") // int in [10, 100[

    println("\n\t. Random.nextLong(100) = ${Random.nextLong(100)}") // long in [0, 100[
    println("\t. Random.nextLong(10, 100) = ${Random.nextLong(10, 100)}") // long in [10, 100[

    println("\n\t. Random.nextDouble(5.0) = ${Random.nextDouble(5.0)}") // Double in [0.0, 5.0[
    println("\t. Random.nextDouble(0.0, 5.0) = ${Random.nextDouble(0.0, 5.0)}") // Double in [0.0, 5.0[




    println("\n\n***** End of theory *****")
}