package projects.bullsCows

/**
 * Stage 3/7: Secret Code
 * https://hyperskill.org/projects/364/stages/2157/implement
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun stage3() {
    val codeLength = getPasswordLength()

    if (codeLength == 0) return

    println("The random secret number is ${getCode(codeLength)}")
}