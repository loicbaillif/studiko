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

    println("\n2) Join mutable lists")
    val starsList1 = mutableListOf("Ginan", "Mu Crucis")
    val tempList1 = southernCross + starsList1
    println("\t. starsList = $southernCross")
    println("\t. starsList2 = $starsList1")
    println("\t. starsList + starsList2 = $tempList1")

    println("\n3) Compare mutable lists")
    val someList1 = mutableListOf("May", "The", "Fourth")
    val someList2 = mutableListOf("May", "The", "Fourth")
    val someList3 = mutableListOf("May", "The", "Force")
    println("\t. list1 = $someList1")
    println("\t. list2 = $someList2")
    println("\t. list3 = $someList3")
    println("\t. list1 == list2 ==> ${someList1 == someList2}")
    println("\t. list1 == list3 ==> ${someList1 == someList3}")
    println("\t. list2 != list3 ==> ${someList2 != someList3}")

    println("\n4) Changing the list contents")
    println("\t. list1 = $someList1")
    println("\t list1[0] = \"Be\"")
    someList1[0] = "Be"
    println("\t. list1 = $someList1")
    someList1.add("Knight")
    println("\t. list1.add(\"Knight\") ==> $someList1")
    someList1.add(1, "Please")
    println("\t. list1.add(1, \"Please\") ==> $someList1")
    someList1.removeAt(0)
    println("\t. list1.removeAt(0) ==> $someList1")
    someList1.clear()
    println("\t. list1.clear() ==> $someList1")


    println("\n***** End of theory *****")
}