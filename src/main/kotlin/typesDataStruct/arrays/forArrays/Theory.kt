package typesDataStruct.arrays.forArrays

/**
 * Theory: for loop and arrays
 * https://hyperskill.org/learn/step/4657
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Iterating through an array")
    val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in daysOfWeek) {
        println("\t. $day")
    }


    println("\n*** 2) Iterating by indexes")
    for (index in daysOfWeek.indices) {
        println("\t. $index -> ${daysOfWeek[index]}")
    }


    println("\n*** 3) Iterating by range indexes")
    for (index in 2..4) {
        println("\t. $index -> ${daysOfWeek[index]}")
    }

    println("Using lastIndex...")
    for (index in 4..daysOfWeek.lastIndex) {
        println("\t. $index -> ${daysOfWeek[index]}")
    }

    println("In reverse order...")
    for (index in 3 downTo 0) {
        println("\t. $index -> ${daysOfWeek[index]}")
    }

    println("With a specific step number")
    for (index in daysOfWeek.lastIndex downTo 0 step 3) {
        println("\t. $index -> ${daysOfWeek[index]}")
    }


    println("\n*** 4) Filing array with user inputs")
    println("Size of the array?")
    val arraySize = readln().toInt()
    val userArray = IntArray(arraySize)

    for (i in 0 until arraySize) {
        println("Provide element n° ${i + 1}")
        userArray[i] = readln().toInt()
    }

    for (index in userArray.indices) {
        println("\t. $index -> ${userArray[index]}")
    }


    println("\n***** End of theory *****")
}