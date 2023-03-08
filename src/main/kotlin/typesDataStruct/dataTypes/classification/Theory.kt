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
    println("\t. zero: Value = $zero - Type = ${zero::class.java.typeName}")
    println("\t. one: Value = $one - Type = ${one::class.java.typeName}")
    print("\t. one million: Value = $oneMillion - ")
    println("Type = ${oneMillion::class.java.typeName}")
    val twoMillions = 2_000_000L // Long because tagged with L
    val bigNumber = 1_000_000_000_000_000 // Long because too big for Int
    val ten: Long = 10 // Long because explicitly specified
    println("\nOther examples:")
    print("\t. two millions: Value = $twoMillions - ")
    println("Type = ${twoMillions::class.java.typeName}")
    print("\t. some big number: Value = $bigNumber - ")
    println("Type = ${bigNumber::class.java.typeName}")
    print("\t. 10: Value = $ten - Type = ${ten::class.java.typeName}")
    val piFive = 3.1415
    val eFloat = 2.71828f
    val someFloat: Float = 13.57f
    println("\t. pi: Value = $piFive - Type = ${piFive::class.java.typeName}")
    println("\t. e: Value = $eFloat - Type = ${eFloat::class.java.typeName}")
    print("\t. some float: Value = $someFloat - ")
    println("Type = ${someFloat::class.java.typeName}")



    println("\n\n***** End of Theory *****")
}