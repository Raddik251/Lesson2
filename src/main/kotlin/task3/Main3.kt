package task3

fun main() {

    var purchaseFinal = 0

    println("Вы совершаете покупки каждый месяц? (Да/Нет)")

    var melomanCheck = readLine()?.toString() ?: return

    println("Ведите сумму покупки:")

    var purchase = readLine()?.toInt() ?: return

    if (melomanCheck == "Да") {
        if (purchase <= 1_000_00) {
            purchaseFinal = (purchase * 99) / 100
        } else if (purchase >= 1_001_00 && purchase <= 10_000_00) {
            purchaseFinal = ((purchase - 100_00) * 99) / 100
        } else {
            purchaseFinal = (((purchase * 95) / 100) * 99) / 100
        }
    } else {
        if (purchase <= 1_000_00) {
            purchaseFinal = purchase
        } else if (purchase >= 1_001_00 && purchase <= 10_000_00) {
            purchaseFinal = purchase - 100_00
        } else {
            purchaseFinal = (purchase * 95) / 100
        }
    }

    println("Первоначальная сумма покупки: ${purchase / 100} рублей ${purchase % 100} копеек.")
    println("Скидка: ${(purchase - purchaseFinal) / 100} рублей ${(purchase - purchaseFinal) % 100} копеек.")
    println("Итоговая сумма покупки: ${purchaseFinal / 100} рублей ${purchaseFinal % 100} копеек.")

}