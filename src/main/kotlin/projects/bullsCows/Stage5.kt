package projects.bullsCows

import java.util.Random

/**
 * Stage 5/7: Improve the code generator
 * https://hyperskill.org/projects/364/stages/2159/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage5() {
    println(GET_PASSWORD_LENGTH)
    val codeLength = getPasswordLength()
    if (codeLength == 0) return

    println(INIT_GAME)
    val solution = getCode(codeLength)
    playTurn(solution)

    println(END_GAME)
}