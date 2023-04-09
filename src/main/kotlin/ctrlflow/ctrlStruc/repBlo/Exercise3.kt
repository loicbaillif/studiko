package ctrlflow.ctrlStruc.repBlo

fun exercise3() {
    // https://hyperskill.org/learn/step/4648
    // Exercise: Maximum element divisible by 4
    println("*** Exercise: Maximum element divisible by 4 ***")

    val nbElts = readln().toInt()
    var max = 0
    repeat(nbElts) {
        val input = readln().toInt()
        if ((input % 4 == 0) && input > max) max = input
    }

    println(max)

    println("\n*** End of exercise ***")
}