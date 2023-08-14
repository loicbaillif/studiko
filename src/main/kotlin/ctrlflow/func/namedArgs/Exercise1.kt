package ctrlflow.func.namedArgs

/**
 * Exercise: URL
 * https://hyperskill.org/learn/step/7864
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

fun exercise1() {
    println("*** Exercise: URL ***")

    println(url(port = "8001", host = "someurl"))
    println(url())

    println("\n*** End of exercise ***")
}


fun url(host: String = "localhost", port: String = "443") =  "https://$host:$port"