package ctrlflow.func.invokFunc

fun theory() {
    // https://hyperskill.org/learn/step/4575
    println("***** Theory *****")

    println("1) Functions arguments")
    println("println(\"ping\") ==> function with & argument")

    println("2) Producing a result")
    val someInt = -10
    val somePositiveInt = Math.abs(someInt)
    println("a positive int : $somePositiveInt")
    val someResult = println("Here I am")
    println("result from a println = $someResult")


    println("\n\n***** End of Theory *****")
}