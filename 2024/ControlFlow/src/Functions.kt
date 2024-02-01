fun main(args: Array<String>) {
    //next topic - return and expressions
    sayHello("Bata", 20)

    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    var number = age
    println("Hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no Internet connection")
}