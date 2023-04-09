package ctrlflow.ctrlStruc.ifEx

fun exercise1() {
    // https://hyperskill.org/learn/step/4598
    // Odd or even
    println("*** Exercise: Odd or even ***")
    val userInput = readln().toInt()
    if (userInput % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }


    println("\n*** End of exercise ***")
}