fun main() {
    val user1 = User("Emma", "Watson", 21)
    val user2 by lazy {
        User("Usuario", "Petro", 23)
    }

    println(user2.firstName)
}

class User(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User: $firstName was created")
    }
}
