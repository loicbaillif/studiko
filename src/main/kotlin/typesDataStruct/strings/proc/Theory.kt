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

    println("\n***** End of theory ***")
}