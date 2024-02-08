fun main(args: Array<String>){
    sum(1, 4, 6, 7, 8, 9, 5, 7, 6)
}

//fun sum(vararg numbers: Int): Int {
//    var result = 0
//    for (number in numbers) {
//        result += number
//    }
//
//    return result
//}

fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
}