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
    println("\t. %d".format(someInt1)) // |12345|
    println("\t. %d".format(someInt2)) // | -98765|
    println("\t. %8d".format(someInt1)) // |   12345|
    println("\t. %8d".format(someInt2)) // |  -98765|
    println("\t. %-8d %s".format(someInt1, "eggs")) // |12345    eggs|
    println("\t. %-8d %s".format(someInt2, "eggs")) // |-98765   eggs|
    println("\t. %+d".format(someInt1)) // |+12345|
    println("\t. %+d".format(someInt2)) // |-98765|
    println("\t. %09d".format(someInt1)) // |000012345|
    println("\t. %09d".format(someInt2)) // |-00098765|
    println("\t. %,10d".format(someInt1)) // |    12,345|
    println("\t. %,10d".format(someInt2)) // |   -98,765|
    println("\t. %+,010d".format(someInt1)) // |+00012,345|
    println("\t. %+,010d".format(someInt2)) // |-00098,765|
    println("\t. % d".format(someInt1)) // | 12345|
    println("\t. % d".format(someInt2)) // |-98765|
    println("\t. %(d".format(someInt1)) // |12345|
    println("\t. %(d".format(someInt2)) // (98765)|

    println("\n*** 5) Formatting octal numbers")
    println("\t. \"%%o\".format($someInt1) = %o".format(someInt1)) // 30071
    println("\t. \"%%o\".format($someInt2) = %o".format(someInt2)) // 3777477063
    println("\t. \"%%#o\".format($someInt1) = %#o".format(someInt1)) // 030071
    println("\t. \"%%8o\".format($someInt1) = %8o".format(someInt1)) //    30071
    println("\t. \"%%-8o (octal)\".format($someInt1) = %-8o (octal)".format(someInt1)) // 30071   (octal)
    println("\t. \"%%08o\".format($someInt1) = %08o".format(someInt1)) // 00030071

    println("\n*** 6) Formatting hexadecimal numbers")
    println("\t. \"%%x\".format($someInt1) = %x".format(someInt1)) // |3039|
    println("\t. \"%%x\".format($someInt2) = %x".format(someInt2)) // |fffe7e33|
    println("\t. \"%%#x\".format($someInt1) = %#x".format(someInt1)) // |0x3039|
    println("\t. \"%%8x\".format($someInt1) = %8x".format(someInt1)) // |    3039|
    println("\t. \"%%-8x (octal)\".format($someInt1) = %-8x (Hexadecimal)".format(someInt1)) // 30071   (octal)
    println("\t. \"%%08x\".format($someInt1) = %08x".format(someInt1)) // 00030071

    println("\n*** 7) Formatting floating point numbers")
    val someDouble1 = 12345.67
    val someDouble2 = -98765.43
    println("\t. %f".format(someDouble1)) // |12345.6700|
    println("\t. %f".format(someDouble2)) // |-98765.4300|
    println("\t. % f".format(someDouble1)) // | 12345.6700|
    println("\t. % f".format(someDouble2)) // |-98765.4300|
    println("\t. %(f".format(someDouble1)) // |12345.6700|
    println("\t. %(f".format(someDouble2)) // |(98765.4300)|
    println("\t. %+f".format(someDouble1)) // |+12345.6700|
    println("\t. %,f".format(someDouble1)) // |12,345.6700|
    println("\t. %-15f".format(someDouble1)) // |12345.670000   |
    println("\t. %015f".format(someDouble1)) // |00012345.670000|
    println("\t. %.1f".format(someDouble1)) // |12345.7|


    println("\n***** End of Theory *****")
}