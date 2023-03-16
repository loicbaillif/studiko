package typesDataStruct.strings.basics

fun exercise1() {
    // https://hyperskill.org/learn/daily/12565
    // JSON
    println("*** Exercise: JSON ***")

    val jsonSample = """
        {
            "firstName": "John",
            "lastName": "Smith",
            "age": 35,
            "phoneNumbers": [
                {
                    "type": "mobile",
                    "number": "123 567-7890"
                }
            ]
        }
    """.trimIndent()

    println(jsonSample)

    println("\n*** End of Exercise ***")
}