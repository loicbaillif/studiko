package typesDataStruct.dataTypes.ranges

/**
 * https://hyperskill.org/learn/step/4633
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n1) Value in interval")

    val lowLimit = 3
    val highLimit = 10
    println("\t. 3 in 3..10 ==> ${3 in lowLimit..highLimit}")
    println("\t. 8 in 3..10 ==> ${8 in lowLimit..highLimit}")
    println("\t. 10 in 3..10 ==> ${10 in lowLimit..highLimit}")
    println("\t. 11 in 3..10 ==> ${11 in lowLimit..highLimit}")

    println("\n2) Value not in interval")
    println("\t. 3 !in 3..10 ==> ${3 !in lowLimit..highLimit}")
    println("\t. 8 !in 3..10 ==> ${8 !in lowLimit..highLimit}")
    println("\t. 10 !in 3..10 ==> ${10 !in lowLimit..highLimit}")
    println("\t. 11 !in 3..10 ==> ${11 !in lowLimit..highLimit}")

    println("\n3) Assign range to variable")
    val range = 18..64
    println("Please enter your age")
    val userAge = readln().toInt()
    if (userAge in range) println("You should have a job.")


    println("\n***** End of Theory *****")
}