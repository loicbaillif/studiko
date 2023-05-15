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
    val someString3 = "That's one small step for a man, one giant leap for mankind."
    val someList3 = someString3.split(",")
    println("\t. $someList3")
    val someString4 = "I'm gonna be a programmer"
    val someList4 = someString4.split(" gonna be ")
    println("\t. $someList4")


    println("\n*** 2) Iterating over a string")
    val someString5 = "Ada Lovelace"
    for (i in 0 until someString5.length) {
        print("${someString5[i]} ")
    }
    var nbSpaces = 0
    for (ch in someString4) {
        if (Character.isWhitespace(ch)) nbSpaces++
    }
    println("\n\t. \"$someString4\" has $nbSpaces spaces.")
    val someString6 = "MVEMJSUN"
    for (index in someString6.indices) {
        println("\t${index+1}. ${someString6[index]}")
    }



    println("\n***** End of theory ***")
}