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
    val someString3 = "%s %S".format("Morning", "Vietnam")
    println(someString3)
    val someString4 = "%1\$s is %2\$s %1\$s".format("Kotlin", "the best language")
    println(someString4)

    println("\n*** 2) Special format specifiers")
    println(String.format("Percentage?%nUse %%%%!"))

    println("\n*** 3) Width and justification")
    for (n in 1..15) println("%${n}s".format("Ping?"))
    println("%-8s %8s".format("hi", "there"))

    println("\n*** 4) Formatting integers")
    val someInt1 = 12345
    val someInt2 = -98765
    println("\t. %d".format(someInt1))
    println("\t. %d".format(someInt2))
    println("\t. %8d".format(someInt1))
    println("\t. %8d".format(someInt2))
    println("\t. %-8d %s".format(someInt1, "eggs"))
    println("\t. %-8d %s".format(someInt2, "eggs"))
    println("\t. %+d".format(someInt1))
    println("\t. %+d".format(someInt2))
    println("\t. %09d".format(someInt1))
    println("\t. %09d".format(someInt2))
    println("\t. %,10d".format(someInt1))
    println("\t. %,10d".format(someInt2))
    println("\t. %+,010d".format(someInt1))
    println("\t. %+,010d".format(someInt2))
    println("\t. % d".format(someInt1))
    println("\t. % d".format(someInt2))
    println("\t. %(d".format(someInt1))
    println("\t. %(d".format(someInt2))

    println("\n*** 5) Formatting octal and hexadecimal numbers")
    println("\t. \"%%o\".format($someInt1) = %o".format(someInt1))
    println("\t. \"%%o\".format($someInt2) = %o".format(someInt2))


    println("\n***** End of Theory *****")
}