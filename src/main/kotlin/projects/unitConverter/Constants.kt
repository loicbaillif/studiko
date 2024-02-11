package projects.unitConverter

const val INPUT_ERROR = "Wrong input"
const val INPUT_PROMPT = "Enter a number and a measure of length:"
const val OUTPUT_DISTANCE = "%d %s is %d meters"
const val UNIT_ERROR = "Wrong input. Unknown unit %s."

// Conversion
const val M_PER_M = 1.0
const val M_PER_KM = 1000.0
const val M_PER_CM = 0.01
const val M_PER_MM = 0.001
const val M_PER_MI = 1609.35
const val M_PER_YD = 0.9144
const val M_PER_FT = 0.3048
const val M_PER_IN = 0.0254


// Arrays
val distCm = arrayOf("cm", "centimeter", "centimeters")
val distFt = arrayOf("ft", "foot", "feet")
val distIn = arrayOf("in", "inch", "inches")
val distKm = arrayOf("km", "kilometer", "kilometers")
val distM = arrayOf("m", "meter", "meters")
val distMi = arrayOf("mi", "mile", "miles")
val distMm = arrayOf("mm", "millimeter", "millimeters")
val distYd = arrayOf("yd", "yard", "yards")