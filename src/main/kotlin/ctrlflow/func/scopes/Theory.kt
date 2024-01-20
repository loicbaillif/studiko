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


    println("\n*** 2) Scope in Loops")
    var outerScope2 = 11
    while (outerScope2++ < 15) {
        var innerScope2 = 10
        innerScope2 *= 2
        print("\t $innerScope2")
    }
    // println("inner scope = $innerScope") // Unresolved reference


    println("\n\n*** 3) Scope in functions")
    val identifier = "Variable in main()"
    localScope()
    println("\t. identifier = $identifier")



    println("\n***** End of theory *****")
}

fun localScope() {
    val identifier = "Variable in localScope()"
    println("\t. identifier = $identifier")
}