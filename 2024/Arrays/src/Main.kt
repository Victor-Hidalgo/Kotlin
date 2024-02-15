fun main(args: Array<String>) {
    val names = arrayOf("John", "Stephen", "Megan")
    val mixedElements = arrayOf(4, 5, 6, 7, "eight")

    names[0] = "Zac"
    println("First element ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (i in mixedElements) {
        if (i is String) {
            println(i)
        }
    }
}