package task2

fun main () {

    println("Введите количество лайков")

    var likes = readLine()?.toInt() ?: return


    if ((likes === 1 && (likes % 10) === 1) || (likes % 100) != 11) {

        println("Ваша запись понравилась $likes человеку")
    } else if (likes === 0) {
            println("Ваша запись не понравилась никому")
        } else {
        println("Ваша запись понравилась $likes людям")
    }
}