fun main() {
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    println(intToRoman(3))
//    println(intToRoman(58))
    println(intToRoman(1994))

}

fun intToRoman(num: Int): String {
    var roman = ""
    var number = num
    var times = number.maxDivisibleBy(1000)
    repeat(times) {
        roman += "M"
        number %= 1000
    }

    times = number.maxDivisibleBy(900)
    repeat(times) {
        roman += "CM"
        number %= 900
    }

    times = number.maxDivisibleBy(500)
    repeat(times) {
        roman += "D"
        number %= 500
    }
    times = number.maxDivisibleBy(400)
    repeat(times) {
        roman += "CD"
        number %= 400
    }

    times = number.maxDivisibleBy(100)
    repeat(times) {
        roman += "C"
        number %= 100

    }
    times = number.maxDivisibleBy(90)
    repeat(times) {
        roman += "XC"
        number %= 90

    }
    times = number.maxDivisibleBy(50)
    repeat(times) {
        roman += "L"
        number %= 50
    }

    times = number.maxDivisibleBy(40)
    repeat(times) {
        roman += "XL"
        number %= 40
    }


    times = number.maxDivisibleBy(10)
    repeat(times) {
        roman += "X"
        number %= 10
    }

    times = number.maxDivisibleBy(9)
    repeat(times) {
        roman += "IX"
        number %= 9
    }

    times = number.maxDivisibleBy(5)
    repeat(times) {
        roman += "V"
        number %= 5
    }

    times = number.maxDivisibleBy(4)
    repeat(times) {
        roman += "IV"
        number %= 4
    }

    repeat(number) {
        roman += "I"
    }


    return roman
}

fun Int.maxDivisibleBy(divisor: Int): Int {
    val number = this
    var dividedTimes = 0
    var reminder = number / divisor
    if (reminder == 0 || reminder < this) {
        return reminder
    } else {
        dividedTimes++
    }
    return dividedTimes;
}