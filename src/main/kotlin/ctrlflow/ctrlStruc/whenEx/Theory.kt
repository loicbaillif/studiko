package ctrlflow.ctrlStruc.whenEx

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Alternatives")
    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+", "plus" -> println(a + b)
        "-", "minus" -> println(a - b)
        "*", "times" -> println(a * b)
        else -> println("Unknown operator")
    }


    println("\n***** End of theory *****")
}