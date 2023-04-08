package typesDataStruct.basicOps.relOps

fun exercise3() {
    // https://hyperskill.org/learn/daily/4536
    // Groundhogs at the party
    println("*** Exercise: Groundhogs at the party ***")

    val nbCups = readln().toInt()
    val isWeekend = readln().toBoolean()
    if (isWeekend) {
        println(nbCups >= 15 && nbCups <= 25)
    } else {
        println(nbCups >= 10 && nbCups <= 20)
    }


    println("\n*** End of exercise ***")
}