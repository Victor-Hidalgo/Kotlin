fun main(args: Array<String>) {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber){
        number++

//        if(!isEvenNumber(number)){
//            continue
//        }
        if ((number % 2 != 0)){
            continue
        }

        evenNumberCounter++
        println(number)
    }
    println("Total number of even numbers found = $evenNumberCounter")
}

fun isEvenNumber(number: Int): Boolean {
    if ((number % 2) == 0){
        return true
    } else {
        return false
    }
}