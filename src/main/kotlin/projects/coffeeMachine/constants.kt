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
const val ENOUGH_RESOURCES = "I have enough resources, making you a %s!"
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
const val MAIN_MENU = "\nWrite action (buy, fill, take, remaining, exit):"
const val MISSING_RESOURCE = "Sorry, not enough %s!\n"
const val SUBMENU_BUY = "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:"
const val SUBMENU_FILL_COFFEE_BEANS = "Write how many grams of coffee beans you want to add: "
const val SUBMENU_FILL_CUPS = "Write how many disposable cups you want to add: "
const val SUBMENU_FILL_MILK = "Write how many ml of milk you want to add:"
const val SUBMENU_FILL_WATER = "Write how many ml of water you want to add:"
const val SUBMENU_TAKE = "I gave you ${'$'}%d"

