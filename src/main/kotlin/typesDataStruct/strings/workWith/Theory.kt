package typesDataStruct.strings.workWith

/**
 * https://hyperskill.org/learn/step/12561
 * Working with Strings - Theory
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n1) Accessing characters")
    val someString1 = "Welcome to Kotlin"
    println("\t. string1 = $someString1")
    println("\t. string1[0] = ${someString1[0]}")
    println("\t. string1[1] = ${someString1[1]}")
    println("\t. string1[3] = ${someString1[3]}")
    println("\t. string1[10] = ${someString1[10]}")
    println("\t. string1.length = ${someString1.length}")
    println("\t. string1[string1.length - 1] = ${someString1[someString1.length - 1]}")
    println("\t. string1.first() = ${someString1.first()}")
    println("\t. string1.last() = ${someString1.last()}")
    println("\t. string1.lastIndex = ${someString1.lastIndex}")

    println("\n2) Empty String")
    val someString2 = ""
    println("\t. string1 = $someString1")
    println("\t. string2 = $someString2")
    println("\t. string1.isEmpty() = ${someString1.isEmpty()}")
    println("\t. string2.isEmpty() = ${someString2.isEmpty()}")

    println("\n3) Immutability")
    var someString3 = "King"
    println("\t. string3 = $someString3")
    println("\t. someString3[1] = 'o' ==> error")
    println("\t. string3 = \"Castle\" ==> OK")
    someString3 = "Castle"
    println("\t. string3 = $someString3")

    println("\n4) Comparing Strings")
    val someString4 = "first"
    val someString5 = "second"
    val someString6 = "first"
    println("\t. string4 = $someString4")
    println("\t. string5 = $someString5")
    println("\t. string6 = $someString6")
    println("\t. string4 == string5 ==> ${someString4 == someString5}")
    println("\t. string4 == string6 ==> ${someString4 == someString6}")
    println("\t. string4 != string6 ==> ${someString4 != someString6}")


    println("\n***** End of theory *****")
}