package basics.stdinout.readlnFun

fun theory() {
    // https://hyperskill.org/learn/step/11224
    println("***** Theory *****")

    println("1) Using readln()")
    println("!!!!! readLine()!! to be used for old versions of Kotlin !!!!!")
    println("Since version 1.6, use readln()")
    val someString1 = readln()
    println("You entered: \n\t $someString1")

    println("2) toInt() and toLong()")
    println("Enter any number:")
    val someInt1 = readln().toInt()
    println("You entered: \n\t Type: ${someInt1::class.java.typeName} - $someInt1")


    println("\n\n***** End of Theory *****")
}