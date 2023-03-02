package valuesVariables

const val CONST = 100

fun exercise3() {
    /*
     * https://hyperskill.org/learn/step/24248
     *
     * Correct the error in the code
     */
    println("Exercise 3: Correct the error in the code")

    val listNumber = mutableListOf<Int>()
    listNumber.add(CONST * CONST)
    listNumber.add(CONST * CONST * CONST)
    listNumber.add(CONST * CONST * CONST * CONST)
    println(listNumber)

    println("*** End of Exercise ***")
}