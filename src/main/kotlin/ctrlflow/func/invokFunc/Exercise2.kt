package ctrlflow.func.invokFunc

fun exercise2() {
    // https://hyperskill.org/learn/step/19913
    // Lembas
    println("*** Exercise: Lembas ***")

    val breadFromFrodo = readln()
    val breadFromSam = readln()

    totalLembas(breadFromFrodo, breadFromSam)

    println("\n*** End of exercise ***")
}


fun totalLembas(first: String, second: String) {
    print(first.toInt() + second.toInt())
}