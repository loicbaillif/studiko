package ctrlflow.ctrlStruc.ifEx

fun exercise3() {
    // https://hyperskill.org/learn/step/4626
    // The max of two numbers without else-branch
    println("*** Exercise: The max of two numbers without else-branch ***")

    val inputA = readln().toInt()
    val inputB = readln().toInt()

    var max = inputA
    if (inputB > inputA) max = inputB

    println(max)

    println("\n*** End of exercise ***")
}