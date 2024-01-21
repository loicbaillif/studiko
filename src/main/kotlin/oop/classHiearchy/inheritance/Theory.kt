package oop.classHiearchy.inheritance

/**
 * Inheritance: Theory
 * https://hyperskill.org/learn/step/7770
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Open the class")
    val germinal = BookTh("Germinal", 435, "Emile Zola", 590)
    println("\t. ${germinal.getFullInfo()}")
    val spidermanComic = ComicsTh("The amazing Spiderman", 60, "Stan Li", 899)
    println("\t. ${spidermanComic.getFullInfo()}")

    println("\n*** 2) Extend it")
    print("Spiderman costs ${spidermanComic.getEurCost()} in Europe ... ")
    println("and ${spidermanComic.getUsdCost()} in the United States")

    println("\n***** End of theory *****")
}