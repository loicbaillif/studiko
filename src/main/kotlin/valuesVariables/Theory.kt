package valuesVariables

fun theory() {
    // https://hyperskill.org/learn/step/4371
    println("***** Theory *****")
    println("1) Declaration")
    println("\tval to declare a read-only variable")
    println("\tvar to declare a mutable variable")
    println("\tconst to add as a prefix, for variables known at compile time")
    val language = "Kotlin"
    var pseudo = "learner"
    println("My name is $pseudo")
    println("I am learning to code with $language")
    pseudo = "KotBeginner"
    println("I am currently known as $pseudo")

    println("2) Storing different types of values")
    val neun = 9
    val welcome = "You are welcome my friend"
    val firstLetter = 'A'
    println(neun)
    println(welcome)
    println(firstLetter)
}