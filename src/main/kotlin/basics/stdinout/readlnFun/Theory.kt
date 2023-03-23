package basics.stdinout.readlnFun

fun theory() {
    // https://hyperskill.org/learn/step/11224
    println("***** Theory *****")

    println("\n1) Using readln()")
    println("!!!!! readLine()!! to be used for old versions of Kotlin !!!!!")
    println("Since version 1.6, use readln()")
    /*
    val someString1 = readln()
    println("You entered: \n\t $someString1")
     */

    println("\n2) toInt() and toLong()")
    // println("Enter any number:")
    /*
    val someInt1 = readln().toInt()
    println("You entered: \n\t Type: ${someInt1::class.java.typeName} - $someInt1")
    val someLong1 = readln().toLong()
    println("You entered: \n\t Type: ${someLong1::class.java.typeName} - $someLong1")
     */

    println("\n3) toDouble() and toBoolean()")
    /*
    println("Enter any floating type number")
    val someDouble1 = readln().toDouble()
    println("You entered:\n\t. Type: ${someDouble1::class.java.typeName}")
    println("\t. Value: $someDouble1")
    */
    println("Do you like vanilla ice-cream? type true or false")
    val someBoolean1 = readln().toBoolean()
    println("you like vanilla ice-cream: $someBoolean1")



    println("\n\n***** End of Theory *****")
}