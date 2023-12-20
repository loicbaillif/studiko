package ctrlflow.except.types.avoidNpe

import java.util.Random

/**
 * Theory: Avoid NPEs. Null safety
 * https://hyperskill.org/learn/step/7619
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Elvis operator")
    val name: String? = (if (Random().nextInt(2) % 2 == 0) "Kotlin" else null)
    println(name)
    val length: Int? = name?.length
    println(if (length != null) length else 0)
    println(length ?: 0)

    println("\n*** 2) !! operator")
    val userString1 = readlnOrNull()
    println(userString1!!.length)


    println("\n***** End of Theory *****")
}