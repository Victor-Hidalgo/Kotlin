fun main() {
    val user = User("Petra")
    val friend = User(firstName = "Antonio", lastName = "Banderas")
    val user2 = User(age = 19, firstName = "Valeria", lastName = "Moan")

    user.firstName = "Vladi"

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)
}

class User(firstName: String, var lastName: String = "LastName", var age: Int = 0){
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
}