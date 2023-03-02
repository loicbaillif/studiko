package valuesVariables

fun exercise3() {
    /*
     * https://hyperskill.org/learn/step/24248
     *
     * Correct the error in the code
     */
    println("Exercise 3: Correct the error in the code")

    const val CONST: Int
    val listNumber = mutableListOf<Int>()
    CONST = 100
    listNumber.add(CONST * CONST)
    listNumber.add(CONST * CONST * CONST)
    listNumber.add(CONST * CONST * CONST * CONST)
    println(listNumber)

    println("*** End of Exercise ***")
}