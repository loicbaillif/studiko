package ctrlflow.ctrlStruc.ifEx

fun theory() {
    // https://hyperskill.org/learn/step/4625
    println("***** Theory *****")

    println("\n1) The single if-case")
    val userAge = readln().toInt()
    if (userAge > 100) {
        println("Not a rookie")
    }

    println("\n***** End of theory *****")
}