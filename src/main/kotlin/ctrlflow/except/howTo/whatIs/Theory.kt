package ctrlflow.except.howTo.whatIs

/**
 * What is an exception - Theory
 * https://hyperskill.org/learn/step/7243
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Causing an exception")
    runIncrementer()


    println("\n***** End of theory *****")
}


fun readNextInt(): Int { return readln().toInt() }


fun runIncrementer() {
    val increment = 1 + readNextInt()
    println(increment)
}