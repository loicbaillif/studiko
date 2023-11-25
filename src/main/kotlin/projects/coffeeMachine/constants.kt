package projects.coffeeMachine

// CONSTANT INTEGERS
const val BEGIN_COFFEE_BEANS = 120
const val BEGIN_CUPS = 9
const val BEGIN_MILK = 540
const val BEGIN_MONEY = 550
const val BEGIN_WATER = 400
const val COFFEE_BEANS_PER_COFFEE = 15
const val MILK_PER_COFFEE = 50
const val WATER_PER_COFFEE = 200


// CONSTANT STRINGS
const val INIT_COFFEE_BEANS = "Write how many grams of coffee beans the coffee machine has:"
const val INIT_MILK = "Write how many ml of milk the coffee machine has:"
const val INIT_WATER = "Write how many ml of water the coffee machine has:"
const val MACHINE_STATUS = """
    The coffee machine has:
    %d ml of water
    %d ml of milk
    %d g of coffee beans
    %d disposable cups
    ${'$'}%d of money
"""
const val QUANTITY_NB_CUPS = """
    For %d cups of coffee you will need:
    %d ml of water
    %d ml of milk
    %d g of coffee beans
"""
const val PROMPT_NB_CUPS = "Write how many cups of coffee you will need:"
const val RESULT_MORE = "Yes, I can make that amount of coffee (and even %d more than that)"
const val RESULT_NOT_ENOUGH = "No, I can make only %d cups of coffee"
const val RESULT_OK = "Yes, I can make that amount of coffee"

