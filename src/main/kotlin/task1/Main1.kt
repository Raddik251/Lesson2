package task1

fun main () {

    var amount = 0U

    var feeFinal = 0U

    println("������� ����� ��� ��������:")

    var moneyTransfer = readLine()?.toUInt() ?: return

    if (moneyTransfer <= 1000_00U) {
        amount = moneyTransfer - 35_00U

        feeFinal = 35_00U
    } else {
        amount = moneyTransfer - ((moneyTransfer * 75U) / 10000U)

        feeFinal = (moneyTransfer * 75U) / 10000U
    }

    println("����� ��������: $amount ������, � ������ ��������: $feeFinal ������.")

}