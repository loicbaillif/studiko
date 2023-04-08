package typesDataStruct.strings.template

fun theory() {
    // https://hyperskill.org/learn/step/4547
    println("***** Theory *****")

    var city = "Paris"
    var temp = 13
    println("The actual temperature in $city is $temp degrees Celcius.")
    city = "Roma"
    temp = 19
    println("The actual temperature in $city is $temp degrees Celcius.")
    val value = 32
    val currency = "Euros"
    val price = "$value $currency"
    println(price)

    println("\n\n***** End of theory *****")
}