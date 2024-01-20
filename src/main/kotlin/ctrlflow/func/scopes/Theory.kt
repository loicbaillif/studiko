package ctrlflow.func.scopes

/**
 * Scopes: Theory
 * https://hyperskill.org/learn/step/17116
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Branching")
    val outerScope = 10
    if (outerScope > 0) {
        val innerScope = outerScope * 2
        println("outer scope = $outerScope")
        println("inner scope = $innerScope")
    } else {
        println("outer scope = $outerScope")
        // println("inner scope = $innerScope") // Unresolved reference
    }


    println("outer scope = $outerScope")
    // println("inner scope = $innerScope") // Unresolved reference




    println("\n***** End of theory *****")
}