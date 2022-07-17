package task1

const val FEE_MONEY = 35_00U

fun main () {

    var amount = 0U

    var feeFinal = 0U

    println("¬ведите сумму дл€ перевода:")

    var moneyTransfer = readLine()?.toUInt() ?: return

    if (moneyTransfer <= 1000_00U) {
        amount = moneyTransfer - 35_00U

        feeFinal = 35_00U
    } else {
        amount = moneyTransfer - ((moneyTransfer * 75U) / 10000U)

        feeFinal = (moneyTransfer * 75U) / 10000U
    }

    println("—умма перевода: $amount копеек, с учетом комиссии: $feeFinal копеек")

}