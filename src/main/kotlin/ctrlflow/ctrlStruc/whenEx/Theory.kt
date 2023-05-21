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


    println("\n*** 3) Branch conditions and ranges")
    val (var3, var4, var5) = readln().split(" ")

    val c = var3.toInt()
    val d = var4.toInt()
    val e = var5.toInt()

    println(when (e) {
        c + d -> "$e equals $c plus $d"
        c - d -> "$e equals $c minus $d"
        c * d -> "$e equals $c times $d"
        else -> "We do not know how to calculate $e"
    })

    print("Enter your age:\n\t")
    val userAge = readln().toInt()
    when (userAge) {
        0 -> println("You were just born?")
        in 1..12 -> println("Heya kiddo")
        in 13..19 -> println("Super, teenager!")
        in 20..60 -> println("Adulthood is fantastic")
        else -> println("You live your happy life")
    }

    when (userAge) {
        in 0..18, in 64..120 -> println("No job at this age")
        else -> println("Hope you enjoy your job!")
    }


    println("\n***** End of theory *****")
}