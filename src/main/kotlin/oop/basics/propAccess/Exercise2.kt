package oop.basics.propAccess

/**
 * Exercise: Weather comparison
 * https://hyperskill.org/learn/step/7369
 * @author JetBrains Academy
 * Solution by Loïc Baillif
 */

const val AVERAGE_DUBAI = 30
const val AVERAGE_HANOI = 20
const val AVERAGE_MOSCOW = 5


class City(val name: String) {
    val cities = listOf("Dubai", "Moscow", "Hanoi")
    val averageTemps = listOf(AVERAGE_DUBAI, AVERAGE_MOSCOW, AVERAGE_HANOI)
    var degrees: Int = 0
        set(value) {
            field = if (value < -92 || value > 57) {
                averageTemps[cities.indexOf(name)]
            } else {
                value
            }
        }
}

fun exercise2() {
    println("*** Exercise: Weather comparison ***")

    val first = 36
    val second = 33
    val third = 36
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    println(giveMinTemp(firstCity, secondCity, thirdCity))

    println("\n*** End of exercise ***")
}


fun giveMinTemp(city1: City, city2: City, city3: City): String {
    val min = minOf(city1.degrees, city2.degrees, city3.degrees)
    val listTemp = listOf(city1.degrees, city2.degrees, city3.degrees)

    return if (listTemp.indexOf(min) == listTemp.lastIndexOf(min)) {
        listOf(city1.name, city2.name, city3.name)[listTemp.indexOf(min)]
    } else {
        "neither"
    }
}