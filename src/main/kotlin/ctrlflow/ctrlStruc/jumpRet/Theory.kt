package ctrlflow.ctrlStruc.jumpRet

/**
 * Theory: Jumps and returns
 * https://hyperskill.org/learn/step/6165
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) The break statement")

    for (i in 1..10) {
        print("\t. loop $i ... ")
        if (i != 4) println("carry on.")
        else {
            println("break!")
            break
        }
    }

    println("\n***** End of theory *****")
}