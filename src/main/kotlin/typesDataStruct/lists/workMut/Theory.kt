package typesDataStruct.lists.workMut

/**
 * Work with MutableLists: Theory
 * https://hyperskill.org/learn/step/14902
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n1) Outputting a list")
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println("\t. starsList = $southernCross")
    println("\t. starsList.joinToString() = ${southernCross.joinToString()}")
    println("\t. starsList.joinToString(\" then \") = ${southernCross.joinToString("then")}")

    println("\n2) Working with multiple lists")
    val starsList1 = mutableListOf("Ginan", "Mu Crucis")
    val tempList1 = southernCross + starsList1
    println("\t. starsList = $southernCross")
    println("\t. starsList2 = $starsList1")
    println("starsList + starsList2 = $tempList1")


    println("\n***** End of theory *****")
}