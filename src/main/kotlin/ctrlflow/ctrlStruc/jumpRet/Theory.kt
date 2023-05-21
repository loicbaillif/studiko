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

    println("\n*** 2) The continue statement")

    println("Printing \"Hello, world!\" without the 'o':")
    for (i in "Hello, world!") {
        if (i == 'o') continue
        println("\t. $i")
    }

    println("\n*** 3) Inner loops and structural jump expressions")
    for (i in 1..4) {
        print("\t")
        for (j in 1..4) {
            if (j == 2) continue
            if (j > i) break
            print("$i$j\t")
        }
        println()
    }


    println("\n*** 4) Labels")
    loop1@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i - j = $j")
            if (j == 3) break@loop1
        }
    }


    println("\n***** End of theory *****")
}