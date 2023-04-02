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

    println("\n4) Escape sequences")
    println("\t. \\n : new line character")
    println("\t. \\t : tab character")
    println("\t. \\r : carriage return character")
    println("\t. \\\\ : backslash character")
    println("\t. \\' : single quote mark")
    println("\t. \\\" : double quote mark")

    println("\n5) Relational operations with characters")
    println("\t. 'a' < 'c' ==> ${'a' < 'c'}")
    println("\t. 'x' >= 'z' ==> ${'x' >= 'z'}")
    println("\t. 'D' == 'D' ==> ${'D' == 'D'}")
    println("\t. 'a' < 'A' ==> ${'a' < 'A'}")
    val someChar8 = 'A'
    val isDigit1 = someChar8 >= '\u0030' && someChar8 <= '\u0039'
    println("$someChar8 is a digit? $isDigit1")

    println("\n6) Processing Characters")
    println("\t. isDigit()")
    println("\t\t'c'.isDigit()? ${'c'.isDigit()}\n\t\t'5'.isDigit()? ${'5'.isDigit()}")
    println("\n\t. isLetter()")
    println("\t\t'3'.isLetter()? ${'3'.isLetter()}\n\t\t'A'.isLetter()? ${'A'.isLetter()}")
    println("\n\t. isLetterOrDigit()")
    println("\t\t'@'.isLetterOrDigit()? ${'@'.isLetterOrDigit()}")
    println("\t\t'é'.isLetterOrDigit()? ${'é'.isLetterOrDigit()}")
    println("\n\t. isWhitespace()")
    println("\t\t'_'.isWhitespace()? ${'_'.isWhitespace()}")
    println("\t\t' '.isWhitespace()? ${' '.isWhitespace()}")
    println("\t\t'\\t'.isWhitespace()? ${'\t'.isWhitespace()}")
    println("\t\t'\\n'.isWhitespace()? ${'\n'.isWhitespace()}")
    println("\n\t. isUpperCase()")
    println("\t\t'5'.isUpperCase()? ${'5'.isUpperCase()}")
    println("\t\t'P'.isUpperCase()? ${'P'.isUpperCase()}")
    println("\t\t'z'.isUpperCase()? ${'z'.isUpperCase()}")
    println("\n\t. isLowerCase()")
    println("\t\t'5'.isLowerCase()? ${'5'.isLowerCase()}")
    println("\t\t'P'.isLowerCase()? ${'P'.isLowerCase()}")
    println("\t\t'z'.isLowerCase()? ${'z'.isLowerCase()}")
    /*
    println("\n\t. toUpperCase() ... Deprecated now")
    println("\t\t'é'.toUpperCase()? ${'é'.toUpperCase()}")
    println("\t\t'z'.toUpperCase()? ${'z'.toUpperCase()}")
     */
    println("\n\t. uppercaseChar()")
    println("\t\t'é'.uppercaseChar()? ${'é'.uppercaseChar()} - type = Char")
    println("\t\t'z'.uppercaseChar()? ${'z'.uppercaseChar()} - type = Char")
    println("\n\t. uppercase()")
    println("\t\t'é'.uppercase()? ${'é'.uppercase()} - type = String")
    println("\t\t'z'.uppercase()? ${'z'.uppercase()} - type = String")
    println("\n\t. toLowerCase() ... Deprecated now")
    println("\t\t'Ö'.toLowerCase()? ${'Ö'.toLowerCase()}")
    println("\t\t'H'.toLowerCase()? ${'H'.toLowerCase()}")




    println("\n\n***** End of theory *****")
}