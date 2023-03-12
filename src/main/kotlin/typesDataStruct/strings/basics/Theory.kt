package typesDataStruct.strings.basics

fun theory() {
    // https://hyperskill.org/learn/step/12553
    println("***** Theory *****")
    println("\n1) The length of a String")
    val someString1 = "I learn Kotlin"
    val someString2 = ""
    println("\t. String: Value = $someString1 - length = ${someString1.length}")
    println("\t. String: Value = $someString2 - length = ${someString2.length}")

    println("\n\n2) Concatenating Strings")
    val someString3 = "abc"
    val someString4 = "def"
    val someString5 = someString3 + someString4
    println("\t. String1: Value = $someString3\n\t. String2: Value = $someString4")
    println("\t. String1 + String2 = $someString5\n")
    val someString6 = "John"
    val someString7 = "Black"
    val someString8 = someString6 + " " + someString7
    println("\t. String1: Value = $someString6\n\t. String2: Value = $someString7")
    println("\t. String1 + \" \" + String2 = $someString8")

    println("\n\n3) Appending values to Strings")
    val someString9 = "ghi" + 123 + false
    println("\t. \"ghi\" + 123 + false = $someString9")
    val someString10 = 'j' + "kl"
    val someString11 = "mn" + 'o'
    println("\t. 'j' + \"kl\" = $someString10")
    println("\t. \"mn\" + 'o' = $someString11")

    println("\n\n4) Repeating the string")
    val someString12 = "-*".repeat(10)
    println("\t. \"-*\".repeat(10) = $someString12")
    val someString13 = "\t- Eat. Sleep. Code.\n".repeat(7)
    println("\t. \"Eat. Sleep. Code.\\n\".repeat(7) =>\n$someString13")



    println("\n\n***** End of Theory *****")
}