package ctrlflow.ctrlStruc.repBlo

fun exercise4() {
    // https://hyperskill.org/learn/step/4645
    // Repeating Blocks
    println("*** Exercise: Repeating Blocks ***")

    val nbInputs = readln().toInt()
    val elements = mutableListOf<Int>(0, 0, 0) // smaller, perfect, larger
    repeat(nbInputs) {
        elements[(readln().toInt()) + 1]++
    }

    println("${elements[1]} ${elements[2]} ${elements[0]}")

    println("\n*** End of exercise ***")
}