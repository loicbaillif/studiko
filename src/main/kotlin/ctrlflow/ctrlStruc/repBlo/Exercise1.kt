package ctrlflow.ctrlStruc.repBlo

fun exercise1() {
    // https://hyperskill.org/learn/step/20145
    // Repeat by value
    println("*** Exercise: Repeat by value ***")

    val userInput = readln().toInt()
    repeat(userInput) {
        print(userInput)
    }


    println("\n*** End of exercise ***")
}