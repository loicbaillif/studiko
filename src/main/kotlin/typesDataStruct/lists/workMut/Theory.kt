package typesDataStruct.lists.workMut

/**
 * Work with MutableLists: Theory
 * https://hyperskill.org/learn/step/14902
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("1) Outputting a list")
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println("\t. starsList = $southernCross")
    println("\t. starsList.joinToString() = ${southernCross.joinToString()}")
    println("\t. starsList.joinToString(\" then \") = ${southernCross.joinToString("then")}")



    println("\n***** End of theory *****")
}