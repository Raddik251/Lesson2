package task2

fun main () {

    println("������� ���������� ������")

    var likes = readLine()?.toInt() ?: return


    if ((likes === 1 && (likes % 10) === 1) || (likes % 100) != 11) {

        println("���� ������ ����������� $likes ��������")
    } else if (likes === 0) {
            println("���� ������ �� ����������� ������")
        } else {
        println("���� ������ ����������� $likes �����")
    }
}