package projects.coffeeMachine

enum class Drinks(val coffee: Int, val milk: Int, val water: Int, val cups: Int, val cost: Int) {
    CAPPUCCINO(-12, -100, -200, -1, 6),
    ESPRESSO(-16, 0, -250, -1, 4),
    LATTE(20, 75, 350, -1, 7);
}