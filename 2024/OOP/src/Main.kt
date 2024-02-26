fun main() {
    val user = User("Petra")
    val friend = User("Antonio", "Bandera")

    println("Name = ${user.name}")
    println("Last Name = ${user.lastName}")
    println("Age = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("Last Name = ${friend.lastName}")
    println("Age = ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int){

    constructor(name: String): this(name, "LastName", 0) {
        println("2nd")
    }

    constructor(name: String, lastName: String): this(name, lastName, 0) {
        println("3rd")
    }
}