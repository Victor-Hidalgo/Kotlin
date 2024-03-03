class Car(name: String, var model: String, var color: String, var doors: Int) {
    var name = name.trim()
    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}

object Database {
    init {
        println("Database created")
    }
}