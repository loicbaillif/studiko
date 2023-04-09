package ctrlflow.ctrlStruc.repBlo

const val LARGER = 1
const val PERFECT = 0
const val SMALLER = -1

fun exercise4() {
    // https://hyperskill.org/learn/step/4645
    // Repeating Blocks
    println("*** Exercise: Repeating Blocks ***")

    val nbInputs = readln().toInt()
    var nbLarger = 0
    var nbPerfect = 0
    var nbSmaller = 0
    repeat(nbInputs) {
        val newPart = readln().toInt()
        if (newPart == LARGER) nbLarger++
        if (newPart == PERFECT) nbPerfect++
        if (newPart == SMALLER) nbSmaller++
    }

    println("\n*** End of exercise ***")
}