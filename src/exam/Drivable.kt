package exam

interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() = println("Driving car")
}