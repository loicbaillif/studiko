package addit.stdLib.mathLib

import kotlin.math.*

/**
 * The Math library - theory
 * https://hyperskill.org/learn/step/12532
 * @author JetBrains Academy
 */

fun theory() {
    println("***** Theory *****")

    println("\n*** 1) Basic functions")
    println("\t. abs(-10) = ${abs(-10)}")
    println("\t. abs(10) = ${abs(10)}")
    println("\t. abs(-10.32) = ${abs(-10.32)}")
    println("\t. abs(10.32) = ${abs(10.32)}")

    println("\n\t. min(12, 34) = ${min(12, 34)}")
    println("\t. max(12, 34) = ${max(12, 34)}")

    println("\n*** 2) Power functions")
    println("\t. sqrt(2.0) = ${sqrt(2.0)}")
    println("\t. sqrt(9.0) = ${sqrt(9.0)}")
    println("\t. 5.0.pow(2.0) = ${5.0.pow(2.0)}")
    println("\t. 3.0.pow(4.0) = ${3.0.pow(4.0)}")
    println("\t. 16.0.pow(-0.5) = ${16.0.pow(-0.5)}")

    println("\n*** 3) logarithm & exponential")
    println("\t. e = $E")
    println("\t. ln(E) = ${ln(E)}")
    println("\t. log(16.0, 4.0) = ${log(16.0, 4.0)}")
    println("\t. ln(exp(2.0) * exp(3.0)) = ${ln(exp(2.0) * exp(3.0))}")

    println("\n*** 4) Trigonometric functions")
    println("\t. PI = $PI")
    println("\t. sin(PI) = ${sin(PI)}")
    println("\t. cos(PI) = ${cos(PI)}")
    println("\t. tan(PI) = ${tan(PI)}")
    println("\t. hypot(6.0, 8.0) = ${hypot(6.0, 8.0)}")



    println("\n\n***** End of theory *****")
}