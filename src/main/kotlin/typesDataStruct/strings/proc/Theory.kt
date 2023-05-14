package typesDataStruct.strings.proc

/**
 * Processing strings : Theory
 * https://hyperskill.org/learn/step/9027
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("*** 1) Splitting the string")
    val someString1 = "I want to break free"
    val someList1 : List<String> = someString1.split(" ")
    println("\t. $someList1")
    val someString2 = "+1-555-345-6789"
    val someList2 = someString2.split("-")
    println("\t. $someList2")


    println("\n***** End of theory ***")
}