package task1

const val FEE_MONEY = 35_00U

fun main () {

    var moneyTransferFinal = 0U

    var feeFinal = 0U

    println("¬ведите сумму дл€ перевода:")

    var moneyTransfer = readLine()?.toUInt() ?: return

    if (moneyTransfer <= ((FEE_MONEY / 75U) * 10000U)) {
        moneyTransferFinal = moneyTransfer - 35_00U

        feeFinal = 35_00U
    } else {
        moneyTransferFinal = moneyTransfer - ((moneyTransfer / 75U) * 10000U)

        feeFinal = (moneyTransfer / 75U) * 10000U
    }

    println("—умма перевода: $moneyTransferFinal, с учетом комиссии: $feeFinal")

}