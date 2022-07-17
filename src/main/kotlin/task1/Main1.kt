package task1

const val FEE_MONEY = 35_00U

fun main () {

    var moneyTransferFinal = 0U

    var feeFinal = 0U

    println("¬ведите сумму дл€ перевода:")

    var moneyTransfer = readLine()?.toUInt() ?: return

    if (moneyTransfer <= 1000_00U) {
        moneyTransferFinal = moneyTransfer - 35_00U

        feeFinal = 35_00U
    } else {
        moneyTransferFinal = moneyTransfer - ((moneyTransfer * 75U) / 10000U)

        feeFinal = (moneyTransfer * 75U) / 10000U
    }

    println("—умма перевода: $moneyTransferFinal копеек, с учетом комиссии: $feeFinal копеек")

}