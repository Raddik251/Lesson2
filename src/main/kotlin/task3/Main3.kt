package task3

fun main() {

    var purchaseFinal = 0

    println("�� ���������� ������� ������ �����? (��/���)")

    var melomanCheck = readLine()?.toString() ?: return

    println("������ ����� �������:")

    var purchase = readLine()?.toInt() ?: return

    if (melomanCheck == "��") {
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

    println("�������������� ����� �������: ${purchase / 100} ������ ${purchase % 100} ������.")
    println("������: ${(purchase - purchaseFinal) / 100} ������ ${(purchase - purchaseFinal) % 100} ������.")
    println("�������� ����� �������: ${purchaseFinal / 100} ������ ${purchaseFinal % 100} ������.")

}