package ctrlflow.lambda.lambdaEx

/**
 * Theory: Lambda Expressions
 * https://hyperskill.org/learn/step/30148
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Functions without names")

    val mul1 = fun(a: Int, b: Int): Int { return  a * b }
    println(mul1(3, 7))



    println("\n***** End of Theory *****")
}