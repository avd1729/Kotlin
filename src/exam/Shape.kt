package exam

abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double): Shape(){
    override fun area() = Math.PI * radius * radius
}