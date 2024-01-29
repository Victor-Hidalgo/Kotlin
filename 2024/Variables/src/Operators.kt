fun main(args: Array<String>) {
    //timestamp - 2:02:25
    var x = 5
    val y = 3.0

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")
    println("x = ${x--}")
    println("x = ${--x}")

    val myNumber = 150
    if (myNumber >= 150) {
        println("Greater than 150")
    }else if (myNumber >90) {
        println("Greater than 90")
    }else {
        println("All the conditions failed")
    }
}