package typesDataStruct.arrays.arrays

/**
 * Theory: Arrays
 * https://hyperskill.org/learn/step/4564
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Creating an array with specified elements ***")
    print("Int array example:\n\t. ")
    val numberArray1 = intArrayOf(1, 2, 3, 4, 5)
    println(numberArray1.joinToString("\t-\t"))

    print("\nChar array example:\n\t. ")
    val charArray1 = charArrayOf('K', 't', 'l')
    println(charArray1.joinToString("\t-\t"))

    print("\nDouble array example:\n\t. ")
    val doubleArray1 = doubleArrayOf(3.14, 0.707, 8.314, -5.25)
    println(doubleArray1.joinToString("\t-\t"))


    println("\n*** 2) Making the array extendable")
    val numberArray2 = intArrayOf(8, 9, 10, )
    println(numberArray2.joinToString("\t-\t"))


    println("\n***** End of theory *****")
}