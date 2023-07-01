package ctrlflow.lambda.funAsObj

/**
 * Theory : Functions as objects
 * https://hyperskill.org/learn/step/5991
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Function references as function parameters")
    println(applyAndSum(2, 3, ::same))
    println(applyAndSum(2, 3, ::square))
    println(applyAndSum(2, 3, ::triple))

    println("\n*** 2) Real-world usage")



    println("\n***** End of Theory *****")
}


fun applyAndSum(a: Int, b:Int, transformation: (Int) -> Int) : Int {
    return transformation(a) + transformation(b)
}


fun same(x: Int) = x
fun square(x: Int) = x * x

fun triple(x: Int) = 3 * x