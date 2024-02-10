package projects.bullsCows

/**
 * Stage 7/7: New level
 * https://hyperskill.org/projects/364/stages/2161
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage7() {
    println(GET_PASSWORD_LENGTH)
    val codeLength = getPasswordLength()
    if (codeLength == -1) return

    println(GET_NUMBER_SYMBOLS)
    val nbSymbols = getNumberSymbols(codeLength)
    if (nbSymbols == -1) return

    println(CODE_PREPARED.format(displayCodeFormat(codeLength, nbSymbols)))

    val solution = getRandomCode(codeLength, nbSymbols)
    playTurn(solution)

    println(END_GAME)

}