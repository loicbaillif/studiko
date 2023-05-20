package ctrlflow.ctrlStruc.whenEx

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Alternatives")
    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+", "plus" -> {
            println("Sum requested")
            println(a + b)
        }
        "-", "minus" -> {
            println("Subtraction requested")
            println(a - b)
        }
        "*", "times" -> {
            println("Multiplication detected")
            println(a * b)
        }
        else -> println("Unknown operator")
    }

    println("\n*** 2) When as an expression")
    println(when (op) {
        "+", "plus" -> a + b
        "-", "minus" -> a - b
        "*", "times" -> a * b
        else -> 0
    })


    println("\n***** End of theory *****")
}