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

    println()
    loop2@ for (i in 1..3) {
        for (j in 1..3) {
            for (k in 1..3) {
                if (k == 2) continue@loop2
                println("i = $i\tj = $j\tk = $k")
            }
        }
    }


    println("\n*** 5) When and structural jump expressions")
    for (i in 1..10) {
        when (i) {
            3 -> continue
            6 -> break
            else -> println("\t. $i")
        }
    }


    println("\n*** 6) The return statement")
    someFunction1()

    for (i in 1..10) {
        for (j in 1..10) {
            println("\t. i = $i\t j = $j")
            if (j == 3) return
        }
        println("This is unreachable code")
    }


    println("\n***** End of theory *****")
}


fun someFunction1() {
    val someNumber = intArrayOf(1, 2, 3, 4, 5)
    for (it in someNumber) {
        if (it == 3) return
        println("\t. $it")
    }
    println("This is unreachable code")
}