package typesDataStruct.arrays.strArrays

/**
 * Theory: String Arrays
 * https://hyperskill.org/learn/step/11477
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Initialization")
    val stringArray1 = arrayOf("my", "first", "array")
    val stringArray2 = arrayOf<String>("Some", "second", "array")
    val stringArray3 = emptyArray<String>()

    println("\n*** 2) Accessing elements")
    println("strings1[0] = ${stringArray1[0]}")
    println("strings2[0] = ${stringArray2[0]}")
    println("strings3[0] = ${try { stringArray3[0] } catch (error : Exception) { "ERROR $error" } }")

}