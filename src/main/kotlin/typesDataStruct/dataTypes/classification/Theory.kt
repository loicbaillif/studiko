package typesDataStruct.dataTypes.classification

fun theory() {
    // https://hyperskill.org/learn/step/4455
    println("***** Theory *****")

    println("1) Numbers")
    println("Four types:")
    println("\t. Byte\n\t. Short\n\t. Int\n\t. Long")
    val zero = 0 // Int
    val one = 1 // Int
    val oneMillion = 1_000_000 // Int as well
    println("Examples:")
    println("\t. zero = $zero")
    println("\t. one = $one")
    println("\t. one million = $oneMillion")
    val twoMillions = 2_000_000L // Long because tagged with L
    val bigNumber = 1_000_000_000_000_000 // Long because too big for Int
    val ten: Long = 10 // Long because explicitely specified
    println("\nOther examples:")
    println("\t. two millions: Value = $twoMillions - Type = ${twoMillions::class.java.typeName}")



    println("\n\n***** End of Theory *****")
}