package ctrlflow.except.types.createCustom

/**
 * Exercise: Create custom exception
 * https://hyperskill.org/learn/step/15020
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: Create custom exception ***")



    println("\n*** End of exercise ***")
}


class ValueIsNegative : Exception {
    constructor() : super()
    constructor(message: String?) : super(message)
}