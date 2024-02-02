fun main(args: Array<String>) {
    val max = getMax(3, 100, 10)
    println(max)
}

fun getMax(a: Int, b: Int) = if (a > b) a else b
    //return if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c){
        a
    } else if (b >= a && b>= c){
        b
    } else {
        c
    }
}

