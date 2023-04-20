package typesDataStruct.basicOps.relOps

const val TARGET = 20
fun exercise4() {
    // https://hyperskill.org/learn/daily/4533
    // Check the sum
    println("*** Exercise: Check the sum ***")

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(a + b == TARGET || a + c == TARGET || b + c == TARGET)

    println("\n*** End of exercise ***")
}