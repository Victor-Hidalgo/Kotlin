fun main() {
    val user = User("Anna", "Maluco", 20)
    val friend = User("maRY", "Banderas", 30)

    println("Name: ${friend.name}")
}

class User(name: String, var lastName: String, var age: Int){
    var name: String

    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A' ")
        }
    }

}