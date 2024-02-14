fun main(args: Array<String>) {

//    for (i in 1..10){
//        println("i = $i")
//    }
//    for (i in 1 until 10){
//        println(i)
//    }

//    for (i in 10 downTo 1){
//        println(i)
//    }

//    for (i in 1 until 10 step 2) {
//        println(i)
//    }
    var number = 0

    outer@ while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5){
            if (i == 0) break@outer
            i++
            println("***$i")
        }
    }
    //it's not possible to target an inner loop from an outer loop

}