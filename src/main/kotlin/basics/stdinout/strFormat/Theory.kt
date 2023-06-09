package basics.stdinout.strFormat

/**
 * Theory: String Formatting
 * https://hyperskill.org/learn/step/21438
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Basic syntax and the general string specifier")
    val someString1 = String.format("%s %s", "Hello", "World!")
    println(someString1)
    val someString2 = "%s %s".format("Goodbye", "Moon!")
    println(someString2)


    println("\n***** End of Theory *****")
}