package projects.bullsCows

// String constants
const val ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyz"
const val CODE_PREPARED = "The secret code is prepared: %s"
const val END_GAME = "Congratulations! You guessed the secret code."
const val GET_PASSWORD_LENGTH = "Input the length of the secret code:"
const val GET_NUMBER_SYMBOLS = "Input the number of possible symbols in the code:"
const val INIT_GAME = "Okay, let's start a game!"
const val INVALID_LENGTH_NEGATIVE = "Error: can't generate a secret number " +
        "which length is negative."
const val INVALID_NUMBER = "Error: \"%s\" is not a number."
const val INVALID_TOO_FEW_SYMBOLS = "Error: can't generate a secret number " +
        "of %d characters with %d symbols"
const val INVALID_TOO_MANY_SYMBOLS = "Error: can't generate a secret number " +
        "with more than 36 symbols symbols"
const val INVALID_PASSWORD_LENGTH = "Error: can't generate a secret number " +
        "with a length of %d because there aren't enough unique digits."
const val RESULT = "Grade: %s."
