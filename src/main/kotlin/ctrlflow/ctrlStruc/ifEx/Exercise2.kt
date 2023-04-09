package ctrlflow.ctrlStruc.ifEx

fun exercise2() {
    // https://hyperskill.org/learn/step/4607
    // Triangle
    println("*** Exercise: Triangle ***")

    val aLength = readln().toInt()
    val bLength = readln().toInt()
    val cLength = readln().toInt()

    if (aLength < (bLength + cLength) &&
        bLength < (aLength + cLength) &&
        cLength < (aLength + bLength)) {
        println("YES")
    } else {
        println("NO")
    }

    println("\n*** End of exercise ***")
}