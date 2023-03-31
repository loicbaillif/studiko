package typesDataStruct.basicOps.intAction

fun exercise1() {
    // https://hyperskill.org/learn/step/4499
    // Desks
    println("*** Exercise: Desks ***")

    val studentsClass1 = readln().toInt()
    val studentsClass2 = readln().toInt()
    val studentsClass3 = readln().toInt()

    val result =
        studentsClass1 / 2 + studentsClass1 % 2 +
        studentsClass2 / 2 + studentsClass2 % 2 +
        studentsClass3 / 2 + studentsClass3 % 2
    println(result)

    println("*** End of exercise ***")
}