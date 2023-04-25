//Напишите функцию countVowels подсчитывающую число гласных английских букв (a, e, i, o, u)
// в строке, у которая передаётся в виде параметра
fun countVowels(a: String): Int {
    var k = 0
    for (char in a) {
        if (char == 'a') {
            k += 1
        }
        if (char == 'e') {
            k += 1
        }
        if (char == 'i') {
            k += 1
        }
        if (char == '0') {
            k += 1
        }
        if (char == 'u') {
            k += 1
        }
    }
    return k
}

fun main() {
    val x = readlnOrNull()
    print(countVowels(x!!))
}