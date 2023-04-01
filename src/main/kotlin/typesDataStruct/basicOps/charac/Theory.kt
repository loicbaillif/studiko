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

    println("\n\n***** End of theory *****")
}