package typesDataStruct.dataTypes.nullNonNull

/**
 * Theory: Nullable and non-nullable types
 * https://hyperskill.org/learn/step/7613
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Nullability")
    val name: String? = null
    val age: Int? = null

    println("\n*** 2) Accessing nullable variables")
    // println(name.length) // Error
    if (name != null) println(name.length)
    println(name?.length)

    println("\n***** End of Theory *****")
}