package typesDataStruct.dataTypes.ranges

/**
 * https://hyperskill.org/learn/step/4633
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    val lowLimit = 3
    val highLimit = 10
    println("\t. 3 in 3..10 ==> ${3 in lowLimit..highLimit}")
    println("\t. 8 in 3..10 ==> ${3 in lowLimit..highLimit}")
    println("\t. 10 in 3..10 ==> ${3 in lowLimit..highLimit}")
    println("\t. 11 in 3..10 ==> ${3 in lowLimit..highLimit}")

    println("\n***** End of Theory *****")
}