package ctrlflow.ctrlStruc.ifEx

fun exercise1() {
    // https://hyperskill.org/learn/step/4598
    // Odd or even
    println("*** Exercise: Odd or even ***")
    val userInput = readln().toInt()
    println(if (userInput % 2 == 0) "EVEN" else "ODD")


    println("\n*** End of exercise ***")
}