class Car(name: String, var model: String, var color: String, var doors: Int) {
    var name = name.trim()
    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}

class User(var firstName: String, var lastName: String, var age: Int){
    lateinit var favoriteMovie: String
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}