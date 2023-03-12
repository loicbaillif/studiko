package typesDataStruct.strings.basics

fun theory() {
    // https://hyperskill.org/learn/step/12553
    println("***** Theory *****")
    println("1) The length of a String")
    val someString1 = "I learn Kotlin"
    val someString2 = ""
    println("\t. String: Value = $someString1 - length = ${someString1.length}")
    println("\t. String: Value = $someString2 - length = ${someString2.length}")

    println("2) Concatening Strings")
    val someString3 = "abc"
    val someString4 = "def"
    val someString5 = someString3 + someString4
    println("\t. String1: Value = $someString3\n\t. String2: Value = $someString4")
    println("\t. String1 + String2 = $someString5")



    println("\n\n***** End of Theory *****")
}