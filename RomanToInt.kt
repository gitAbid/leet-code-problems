import kotlin.math.sin

fun main() {
    println(
        romanToInt("MCMXCIV"),
    )
    println(
        romanToInt("LVIII"),
    )
    println(
        romanToInt("III"),
    )
}

fun romanToInt(s: String): Int {
    val multiRomanToIntMap = mapOf(
        "CM" to 900,
        "CD" to 400,
        "XC" to 90,
        "XL" to 40,
        "IX" to 9,
        "IV" to 4,
    )

    val singleRomanToIntMap = mapOf(
        "M" to 1000,
        "D" to 500,
        "C" to 100,
        "L" to 50,
        "X" to 10,
        "V" to 5,
        "I" to 1,
    )

    var roman = s;
    val multiValueSome = roman.windowed(2, 1) { char ->
        multiRomanToIntMap[char]?.let {
            roman=roman.replaceFirst(Regex(char.toString()), "")
            it
        }?: 0
    }.sum()

    val singleValueSome = roman.sumOf {
        singleRomanToIntMap[it.toString()] ?: 0
    }

    return multiValueSome+singleValueSome
}