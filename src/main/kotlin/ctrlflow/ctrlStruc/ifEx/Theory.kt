package ctrlflow.ctrlStruc.ifEx

fun theory() {
    // https://hyperskill.org/learn/step/4625
    println("***** Theory *****")

    println("\n1) The single if-case")
    println("Please provide your age")
    val userAge = readln().toInt()
    if (userAge > 100) {
        println("Not a rookie")
    }
    val userIsMajor = userAge >= 18
    if (userIsMajor) {
        println("Congratulations, you are old enough to pay taxes")
    }
    if (!userIsMajor) {
        println("Here is a hot chocolate kiddo")
    }

    println("\n2) The if-else-cases")
    if (userAge % 2 == 0) {
        println("Your current age is even")
    } else {
        println("Your current age is odd")
    }

    println("\n3) The if-else-if-cases")
    if (userAge < 18) {
        println("You are going to school, aren't you?")
    } else if (userAge < 25) {
        println("You are probably currently a student, enjoy.")
    } else if (userAge < 64) {
        println("Still that young? Time to work!")
    } else if (userAge < 90) {
        println("Enjoy your money and your life, retirement is great")
    } else {
        println("You had such an amazing life")
    }

    println("\n4) Nested if")
    if (userAge < 25) {
        if (userAge < 18) {
            println("Still living with your parents, right?")
        } else {
            println("You might live in your own place, but paid by parents")
        }
    } else {
        if (userAge < 60) {
            println("Your kids live with you?")
        } else {
            println("Libertyyyyy")
        }
    }
    if (userAge % 2 == 0) {
        if (userAge % 3 == 0) {
            println("Your age can be divided by 6")
        } else {
            println("Your age can be divided by 2")
        }
    } else {
        println("Your age cannot be divided by 2")
    }

    println("\n5) Condition as an expression")
    println("Please provide your sister's age")
    val sisterAge = readln().toInt()
    val oldestSiblingAge = if (userAge > sisterAge) {
        println("You are the oldest")
        userAge
    } else {
        println("Your sister is the oldest")
        sisterAge
    }
    println("The oldest sibling is $oldestSiblingAge")


    println("\n***** End of theory *****")
}