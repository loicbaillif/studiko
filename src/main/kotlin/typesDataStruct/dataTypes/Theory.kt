package typesDataStruct.dataTypes

fun theory() {
    // https://hyperskill.org/learn/step/4388
    println("***** Theory *****")

    println("\n***1) Variable types")
    val integer1 = 32
    val integer2: Int = 55
    println("First integer = $integer1")
    println("Second integer = $integer2")
    val myText: String = "Hello, I am studying Kotlin"
    val nInt: Int = 111_111
    println("My text = $myText")
    println("My int = $nInt")

    println("\n***2) Type mismatch")
    // val nInt2: Int = "abc"; // Type mismatch
    var myAge = 33
    // myAge = "33 years old" // Type mismatch, we cannot change a var type



    println("\n\n***** End of Theory *****")
}