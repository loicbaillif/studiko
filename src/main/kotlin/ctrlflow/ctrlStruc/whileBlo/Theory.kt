package ctrlflow.ctrlStruc.whileBlo

fun theory() {
    // https://hyperskill.org/learn/step/4659
    println("***** Theory *****")

    println("\n1) While loop")
    var someInt = 0
    while (someInt < 5) {
        println("\t. i = ${someInt++}")
    }

    var someChar = 'A'
    while (someChar <= 'Z') {
        println("\t. ${someChar++}")
    }


    println("\n***** End of theory *****")
}