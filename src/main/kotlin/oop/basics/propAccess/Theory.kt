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

    val client2 = Client1()
    println(client2.info)
    client2.age = 33
    client2.name = "Charlie"
    println(client2.info)


    println("\n*** 3) Property setter")
    val client3 = ClientB()
    client3.name = "Delta"
    println(client3.name)


    println("\n*** 4) Custom setter")
    println(client3.age)
    client3.age = -5
    println(client3.age)

    println("\n*** 5) Additional features")
    val client4 = ClientC()
    println(client4.passport.number)
    // client4.passport = Passport("2345678") Not possible, defined as val
    client4.passport.number = "2345678"
    println(client4.passport.number)



    println("\n***** End of theory *****")
}


class Client1 {
    var name = "Unknown"
        get() {
            if (field == "Unknown") println("You should give a name to this customer")
            println("\n\t!!! Somebody wants to know $field name !!!")
            return field
        }

    var age: Int = 18
    val info: String
        get() {
            return "name = $name\tage = $age"
        }
}


class ClientB {
    val defaultAge = 20
    var name = "Unknown"
        get() {
            return "My name is $field"
        }
        set(value) {
            println("[INFO] Changing name from $field to $value")
            field = value
        }

    var age = 18
        set(value) {
            if (value < 0) {
                println("An age cannot be negative ... Assigning default value $defaultAge instead")
                field = defaultAge
            } else {
                field = value
            }
        }
}


class ClientC {
    val passport = Passport("1234567")
}


class IntegerRepository1 {
    private val _list = mutableListOf(36, 10, 59, 97)
    val list: List<Int> get() = _list
}


class Passport(number: String) {
    var number = number
        set (value) {
            println("Passport number has changed")
            field = value
        }
}