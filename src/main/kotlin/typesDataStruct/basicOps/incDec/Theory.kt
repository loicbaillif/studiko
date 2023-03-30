package typesDataStruct.basicOps.incDec

fun theory() {
    // https://hyperskill.org/learn/step/10776
    println("***** Theory *****")

    println("1) Assignment Operations")
    var a = 4
    println("\t. a = $a")
    a += 3
    println("\t. a += 3 ==> $a")
    a -= 2
    println("\t. a -= 2 ==> $a")
    a *= 4
    println("\t. a *= 4 ==> $a")
    a /= 2
    println("\t. a /= 2 ==> $a")
    a %= 6
    println("\t. a %= 6 ==> $a")

    println("\n2) Using increment and decrement")
    println("\t. a = $a")
    a++
    println("\t. a++ ==> a = $a")
    a--
    println("\t. a-- ==> a = $a")

    println("\n3) Prefix form")
    println("Prefix form changes the value BEFORE variable is used")
    println("\t. a = $a")
    val b = ++a
    println("\t. b = ++a ==> b = $b - a = $a")

    println("\n4) Postfix form")
    println("Postfix form changes the value AFTER variable is used")
    println("\t. a = $a")
    val c = a++
    println("\t. c = a++ ==> c = $c - a = $a")

    println("\n5) Precedence order")
    println("\t. Parentheses")
    println("\t. Postfix increment/decrement")
    println("\t. Unary plus/minus and prefix increment/decrement")
    println("\t. Multiplication, division and modulus")
    println("\t. Addition and subtraction")
    println("\t. Assignment operators: = += -= *= /+ %=")


    println("\n\n***** End of theory *****")
}