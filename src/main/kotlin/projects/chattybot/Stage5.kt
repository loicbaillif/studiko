package projects.chattybot

/**
 * Stage 5: Multiple Choice
 * https://hyperskill.org/projects/126/stages/672/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage5() {
// Stage 1
    st1()

    // Stage 2
    st2()

    // Stage 3
    st3()

    // Stage 4
    st4()

    // Stage 5
    st5()

    println("Congratulations, have a nice day!")
}


fun st1() {
    // Stage 1
    println("Hello! My name is Aid.")
    println("I was created in 2020.")
}


fun st2() {
    // Stage 2
    println("Please, remind me your name.")
    val userName = readln()
    println("What a great name you have, $userName!")
}


fun st3() {
    // Stage 3
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainderBy3 = readln().toInt()
    val remainderBy5 = readln().toInt()
    val remainderBy7 = readln().toInt()
    val userAge = (remainderBy3 * 70 + remainderBy5 * 21 + remainderBy7 * 15) % 105
    println("Your age is $userAge; that's a good time to start programming!")
}


fun st4() {
    // Stage 4
    println("Now I will prove to you that I can count to any number you want.")
    val userRequest = readln().toInt()
    for (i in 0..userRequest) println("$i!")
}


fun st5() {
    println("Let's test your programming knowledge.")
    println("""
        Why do we use methods?
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.
    """.trimIndent())
    var userAnswer = readln().toInt()
    while (userAnswer != 2) {
        userAnswer = readln().toInt()
    }
}