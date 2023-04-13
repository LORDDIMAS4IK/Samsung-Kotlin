//ДНК состоит из 4 типов нуклеотидов: A (аденин), T (тимин), G (гуанин), C (цитозин).
//Ваша программа получает на вход строку вида ATGCCTCTCTC и должна посчитать
// число нуклеотидов каждого типа (вывести числа через пробел в порядке как в строке выше).
fun main() {
    val a = readlnOrNull()
    var A: Int = 0 // counter of A
    var T: Int = 0 // counter of A
    var G: Int = 0 // counter of A
    var C: Int = 0 // counter of A
    for (char in a!!) {
        if (char == 'A') {
            A += 1
        }
        if (char == 'T') {
            T += 1
        }
        if (char == 'G') {
            G += 1
        }
        if (char == 'C') {
            C += 1
        }
    }
    print(A)
    print(' ')
    print(T)
    print(' ')
    print(G)
    print(' ')
    print(C)
}