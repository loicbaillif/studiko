package projects.zookeeper

const val endOfVisit = "See you later!"
fun stage4() {
    // https://hyperskill.org/projects/196/stages/978/implement
    // Stage 4: Sustainable care
    println("\n*** Stage 4: Sustainable Care <3 ***")

    val animalsList = mutableListOf<String>(camel, lion, deer, goose, bat, rabbit)
    do {
        println(greeting)
        val userChoice = readln()
        if (userChoice != "exit") println(animalsList[userChoice.toInt()])
    } while (userChoice != "exit")


    println(endOfVisit)

    println("\n*** End of stage 4 ***")
}