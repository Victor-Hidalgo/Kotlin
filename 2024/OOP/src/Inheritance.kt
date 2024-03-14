fun main(args: Array<String>) {
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "WHITE and BLUE", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String) {
    fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, engines: Int, val doors: Int): Vehicle(name, color) {

}

class Plane(name: String, color: String, val engine: Int, val doors: Int): Vehicle(name, color) {

}