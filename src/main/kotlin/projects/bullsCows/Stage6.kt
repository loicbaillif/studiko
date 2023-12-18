package projects.bullsCows

/**
 * Stage 6/7: New level
 * https://hyperskill.org/projects/364/stages/2160/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage6() {
    println(GET_PASSWORD_LENGTH)
    val codeLength = getPasswordLength()
    if (codeLength == 0) return

    println(GET_NUMBER_SYMBOLS)
    val nbSymbols = getNumberSymbols(codeLength)
    if (nbSymbols == 0) return
}