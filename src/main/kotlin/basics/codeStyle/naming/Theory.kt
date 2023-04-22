package basics.codeStyle.naming

/**
 * https://hyperskill.org/learn/step/4389
 * @author JetBrains Academy
 */

const val DAYS_PER_WEEK = 7
const val ALTITUDE = 36_000_000

fun theory() {
    println("***** Theory *****")

    println("\n1) Naming Rules")
    println("\t. Names are case-sensitive")
    println("\t. Each name can include only letters, digits and underscores")
    println("\t. A name cannot start with a digit.")
    println("\t. A name cannot be a keyword")

    println("\nGood variable names:")
    println("\tscore, level, fruitType, i, abc, _cost, number32")
    println("\t`name with space`")
    println("\nInvalid variable names:")
    println("\t@pple, \$dollar, 3pi, !abc, val, var, _, name with space")

    println("\n2) Conventions for naming variables")
    println("\t. If variable name is a single word, lowercase")
    println("\t. If variable name has multiple words, camelCase")
    println("\t. Do not start a variable name with an _")
    println("\t. Choose meaningful name: userAge instead of a")

    println("\n3) Magic Numbers")
    println("\t. Should be declared as constants")
    println("\t. Should be named using SCREAMING_SNAKE_CASE")
    println("How many days per week? $DAYS_PER_WEEK")
    println("How high are GEO satellites? $ALTITUDE meters")


    println("\n***** End of theory *****")
}