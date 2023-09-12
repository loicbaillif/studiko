package addit.errorless.debug

/**
 * Theory: Debugging techniques
 * https://hyperskill.org/learn/step/13739
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Logging/println technique")
    count(1, 10)


    println("\n*** 2) Assertions")

    println("\n***** End of theory *****")
}


fun count(start: Int, to: Int) {
    var start = start
    println("count() started")
    while (start < to) {
        println(start)
        start++
    }
    println("count() ended")
}


class Cat(val name: String, val age: Int) {
    val enoughCat = false // Of course, it's a false, there are never enough cats!
    init {
        check(!enoughCat) { "You cannot add a new cat" } // IllegalStateException
        require(age >= 0) { "Invalid age: $age" }        // IllegalArgumentException
        require(name.isNotEmpty()) { "You should pick a name" }
    }
}