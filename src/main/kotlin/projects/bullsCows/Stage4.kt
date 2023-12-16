package projects.bullsCows

/**
 * Stage 4/7 : Game Time!
 * https://hyperskill.org/projects/364/stages/2158/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage4() {
    println(GET_PASSWORD_LENGTH)
    val codeLength = getPasswordLength()
    if (codeLength == 0) return

    println(INIT_GAME)
    val solution = getCode(codeLength)
    var nbTurns = 1
    do {
        println("Turn ${nbTurns++}")
        val userNumber = readln()
        val bullsCows = assessNumber(userNumber, solution)
        println(RESULT.format(formatResult(bullsCows)))
    } while (bullsCows[0] != codeLength)

}