package oop.basics.propAccess

/**
 * Theory: Property Accessors
 * https://hyperskill.org/learn/step/10511
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("*** 1) Property getter")
    val client1 = Client1()
    println(client1.name)
    val repository1 = IntegerRepository1()
    // repository1.list.add(33) // Generates an error, Unresolved reference
    for (elt in repository1.list) println("\t$elt")

    println("\n*** 2) Custom getter")
    client1.name = "Alpha"
    val someName = client1.name
    println(someName)
    client1.name = "Bravo"
    println(client1.info)


    println("\n***** End of theory *****")
}


class Client1 {
    var name = "Unknown"
        get() {
            if (field == "Unknown") println("You should give a name to this customer")
            println("Somebody wants to know $field name")
            return field
        }

    var age: Int = 18
    val info: String
        get() {
            return "name = $name\tage = $age"
        }
}


class IntegerRepository1 {
    private val _list = mutableListOf<Int>(36, 10, 59, 97)
    val list: List<Int> get() = _list
}