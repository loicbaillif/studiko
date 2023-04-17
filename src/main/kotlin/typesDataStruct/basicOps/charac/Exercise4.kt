package typesDataStruct.basicOps.charac

fun exercise4() {
    // https://hyperskill.org/learn/step/4688
    // Sequence
    println("*** Exercise: Sequence ***")

    val userChar1 = readln().first()
    val userChar2 = readln().first()
    val userChar3 = readln().first()
    println( (userChar1 + 1 == userChar2) && (userChar2 + 1) == userChar3 )

    println("\n*** End of exercise ***")
}