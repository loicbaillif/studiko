package ctrlflow.ctrlStruc.repBlo

fun theory() {
    println("***** Theory *****")

    println("\n1) Repeat Loop")
    repeat(3) {
        println("\t. Hello and Welcome! (repetition $it)")
    }

    println("\n2) Reading and processing data in a loop")
    val nbRep = readln().toInt()
    var sum = 0
    repeat(nbRep) {
        sum += readln().toInt()
    }
    println("Sum of $nbRep numbers: $sum")

    println("\n***** End of theory *****")
}