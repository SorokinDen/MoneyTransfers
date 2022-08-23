fun main() {
    val amount = 100000
    var comissions = amount * 0.75 / 100
    if (comissions > 3500) {
        println("Коммиссия " + comissions/100 + " рублей")
    } else {
        println("Коммиссия 35.0 рублей")
    }

}