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
    // val userAge = readln().toInt()
    val userAge = 33
    if (userAge in range) println("You should have a job.")

    println("\n4) ranges of characters and strings")
    println("'b' in 'a'..'c' ==> ${'b' in 'a'..'c'}")
    println("'k' in 'a'..'e' ==> ${'k' in 'a'..'e'}")
    println("\"hello\" in \"he\"..\"hi\" ==> ${"hello" in "he".."hi"}")
    println("\"abc\" in \"aab\"..\"aac\" ==> ${"abc" in "aab".."aac"}")


    println("\n***** End of Theory *****")
}