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

    println("\n*** 3) Creating an array of specified size")
    val numberArray3 = IntArray(4)
    val charArray2 = CharArray(6)
    println("\t. " + numberArray3.joinToString())
    println("\t. " + charArray2.joinToString())
    val numberArray4 = IntArray(10) { i -> (i + 1) * (i + 1) }
    println("\t. " + numberArray4.joinToString(" ; "))
    val numberArray5 = IntArray(6) { 42 }
    println("\t. " + numberArray5.joinToString(" ; "))
    val numberArray6 = IntArray(8).apply { fill(-3, 2, 6) }
    println("\t. " + numberArray6.joinToString(" ; "))

    println("\n*** 4) Reading array from input")
    val numberArray7 = IntArray(3) { readln().toInt() }
    println("\t. " + numberArray7.joinToString(" ; "))
    val userInput1 = "9 5 14 -5 7 741"
    val numberArray8 = userInput1.split(' ').map { it.toInt() * 2 }.toIntArray()
    println("\t. " + numberArray8.joinToString(" ; "))
    val regex1 = "\\s+".toRegex()
    val userInput2 = "1\t\t2  3\n\t4 5"
    println("\t. input = $userInput2")
    val numberArray9 = userInput2.split(regex1).map { it.toInt() }.toTypedArray()
    println("\t. " + numberArray9.joinToString(" ; "))

    println("\n*** 5) Array size")
    val arrayOfArrays = arrayOf(numberArray1, numberArray2, numberArray3, numberArray4, numberArray5)
    for (i in 0..arrayOfArrays.lastIndex) {
        println("\t. Array ${i + 1} has ${arrayOfArrays[i].size} elements;")
    }

    println("\n*** 6) Accessing elements")
    println("\t. numbers.first() = ${numberArray1.first()}")
    println("\t. numbers.last() = ${numberArray1.last()}")
    println("\t. numbers.lastIndex = ${numberArray1.lastIndex}")

    println("\n*** 7) Comparing arrays")
    val numberArray11 = intArrayOf(5, 7, 9,)
    val numberArray12 = intArrayOf(5, 7, 9)
    val numberArray13 = intArrayOf(5, 7, 9, 11)
    println("\t. numbers1 = ${numberArray11.joinToString(" ; ")}")
    println("\t. numbers2 = ${numberArray12.joinToString(" ; ")}")
    println("\t. numbers3 = ${numberArray13.joinToString(" ; ")}")
    println("\t. numbers1.contentEquals(numbers2) ==> ${numberArray11.contentEquals(numberArray12)}")
    println("\t. numbers1.contentEquals(numbers3) ==> ${numberArray11.contentEquals(numberArray13)}")
    println("\t. numbers2.contentEquals(numbers3) ==> ${numberArray12.contentEquals(numberArray13)}")


    println("\n***** End of theory *****")
}