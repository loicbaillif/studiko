package ctrlflow.ctrlStruc.ifEx

fun theory() {
    // https://hyperskill.org/learn/step/4625
    println("***** Theory *****")

    println("\n1) The single if-case")
    val userAge = readln().toInt()
    if (userAge > 100) {
        println("Not a rookie")
    }
    val userIsMajor = userAge >= 18
    if (userIsMajor) {
        println("Congratulations, you are old enough to pay taxes")
    }
    if (!userIsMajor) {
        println("Here is a hot chocolate kiddo")
    }

    println("\n***** End of theory *****")
}