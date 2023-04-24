package projects.chattybot

/**
 * https://hyperskill.org/projects/126/stages/670/implement
 * Stage 3/5 : Guess the age
 * @author JetBrains Academy
 */

fun stage3() {
    // Stage 1
    println("Hello! My name is Aid.")
    println("I was created in 2020.")

    // Stage 2
    println("Please, remind me your name.")
    val userName = readln()
    println("What a great name you have, $userName!")

    // Stage 3
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainderBy3 = readln().toInt()
    val remainderBy5 = readln().toInt()
    val remainderBy7 = readln().toInt()
    val userAge = (remainderBy3 * 70 + remainderBy5 * 21 + remainderBy7 * 15) % 105
    println("Your age is $userAge; that's a good time to start programming!")
}