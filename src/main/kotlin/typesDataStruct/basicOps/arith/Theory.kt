package typesDataStruct.basicOps.arith

fun theory() {
    // https://hyperskill.org/learn/step/4472
    println("***** Theory *****")

    println("\n1) Binary Operators")
    println("\t. Addition: +")
    println("\t\t24 + 31 = 55\n\t\t32 + 10 = 42")
    println("\t. Subtraction: -")
    println("\t\t40 - 20 = 20\n\t\t20 - 40 = -20")
    println("\t. Multiplication: *")
    println("\t\t3 * 33 = 99\n\t\t21 * 12 = 252")
    println("\t. Integer division: /")
    println("\t\t9 / 4 = ${9 / 4}\n\t\t37 / 6 = ${37 / 6}")
    println("\t. Remainder (modulus): %")
    println("\t\t9 % 4 = ${9 % 4}\n\t\t37 % 6 = ${37 % 6}")

    println("\n2) Complex expressions")
    println("\t1 + 2 * 3 - 4 = ${1 + 2 * 3 - 4}")
    println("\t(1 + 2) * (3 - 4) = ${(1+2)*(3-4)}")
    println("\t(1 + 2) * 3 - 4 = ${(1 + 2) * 3 - 4}")

    println("\n3) Unary Operators")
    println("\t+(5) = ${+(5)}")
    println("\t-(5) = ${-(5)}")

    println("\n4) Precedence order")
    println("From the highest to the lowest priority:")
    println("\t. Parentheses")
    println("\t. Unary plus/minus")
    println("\t. Multiplication, division, modulus")
    println("\t. Addition and subtraction")
    println("\nTip for precedence order: BODMAS")
    println("\t. Brackets\n\t. Order\n\t. Division")
    println("\t. Multiplication\n\t. Addition\n\t. Subtraction")


    println("\n\n***** End of theory *****")
}