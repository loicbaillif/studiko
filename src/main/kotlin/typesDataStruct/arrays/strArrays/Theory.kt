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
    println("\t. strings1[0] ==> ${stringArray1[0]}")
    println("\t. strings2[0] ==> ${stringArray2[0]}")
    println("\t. strings3[0] ==> ${try { stringArray3[0] } catch (error : Exception) { "ERROR $error" } }")

    stringArray1[0] = "Your"
    stringArray2[0] = "Random"
    println("\t. strings1[0] ==> ${stringArray1[0]}")
    println("\t. strings2[0] ==> ${stringArray2[0]}")


    println("\n*** 3) Outputting an array")
    println("\t. strings1.joinToString() ==> ${stringArray1.joinToString()}")
    println("\t. strings2.joinToString() ==> ${stringArray2.joinToString()}")


    println("\n*** 4) Working with multiple arrays")
    val stringArray4 = stringArray1 + stringArray2
    println("\t. strings1 + strings2 ==> ${stringArray4.joinToString()}")

}