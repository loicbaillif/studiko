package typesDataStruct.strings.subString

/**
 * Getting substrings: Theory
 * https://hyperskill.org/learn/step/8535
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Getting a part of a string")
    val someString1 = "Hello"
    println("\t. String1.substring(0, 1) ==> ${someString1.substring(0, 1)}")
    println("\t. String1.substring(0, 3) ==> ${someString1.substring(0, 3)}")
    println("\t. String1.substring(1, 3) ==> ${someString1.substring(1, 3)}")
    println("\t. String1.substring(1) ==> ${someString1.substring(1)}")
    println("\t. String1.substring(3, 5) ==> ${someString1.substring(3, 5)}")

    println("\n\t. String1.substringAfter('l') ==> ${someString1.substringAfter('l')}")
    println("\t. String1.substringAfter('z') ==> ${someString1.substringAfter('z')}")
    println("\t. String1.substringBefore('o') ==> ${someString1.substringAfter('o')}")
    println("\t. String1.substringBefore('z') ==> ${someString1.substringAfter('z')}")

    println("\t. ${someString1.substringAfter('z', "Cannot find it")}")

    print("\n\t. String1.substringAfterLast('l') ==> ")
    println(someString1.substringAfterLast('l'))
    print("\t. String1.substringBeforeLast('l') ==> ")
    println(someString1.substringBeforeLast('l'))


    println("\n*** 2) Replacing parts of a string")
    val someString2 = "Good morning..."
    println(someString2.replace("morning", "bye"))
    println(someString2.replace("...", "!"))


    println("\n***** End of theory *****")
}