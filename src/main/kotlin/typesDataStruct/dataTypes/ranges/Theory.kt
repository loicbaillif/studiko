package typesDataStruct.dataTypes.ranges

/**
 * https://hyperskill.org/learn/step/4633
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    val lowLimit = 3
    val highLimit = 10
    println("Please enter a number:")
    val userInput = readln().toInt()
    print("$userInput in $lowLimit..$highLimit ==> ")
    println(userInput in lowLimit..highLimit)


    println("\n***** End of Theory *****")
}