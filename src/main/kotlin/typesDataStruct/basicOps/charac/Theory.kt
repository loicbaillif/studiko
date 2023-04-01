package typesDataStruct.basicOps.charac

fun theory() {
    // https://hyperskill.org/learn/step/4680
    println("***** Theory *****")

    println("1) What is a character")
    val someChar1 : Char = 'G'
    val someChar2 = 'o'
    val someChar3 = ' '
    val someChar4 = '€'
    println("Characters: $someChar1 - $someChar2 - $someChar3 - $someChar4")
    val someChar5 = '\u0040' // @
    println(someChar5)
    val someChar6 = 'µ'
    println(someChar6.code)
    val someInt1 = 169
    println(someInt1.toChar())

    println("\n2) How to read characters")
    /*
    val someChar7 = readln().first()
    println("First character = $someChar7 - code = ${someChar7.code}")
     */

    println("\n3) Retrieving subsequent characters")
    println("\tCharacter: $someChar1 -\t $someChar1 + 3 = ${someChar1 + 3}")
    println("\tCharacter: $someChar2 -\t $someChar2 - 5 = ${someChar2 - 5}")
    println("\tCharacter: $someChar3 -\t $someChar3 + 7 = ${someChar3 + 7}")
    println("\tCharacter: $someChar4 -\t $someChar4 - 9 = ${someChar4 - 9}")


    println("\n\n***** End of theory *****")
}