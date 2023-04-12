package typesDataStruct.lists.introMut

fun exercise2() {
    // https://hyperskill.org/learn/daily/14882
    // Initializing a list
    println("*** Exercise: Initializing a list ***")

    val result = MutableList(100) { 0 }
    result[0] = 1
    result[9] = 10
    result[99] = 100
    println(result)

    println("\n*** End of exercise ***")
}