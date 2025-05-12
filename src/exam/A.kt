package exam

open class A {
    open fun show() = println("Class A")
}

class B : A() {
    override fun show() {
        super.show()
        println("Class B")
    }
}

fun main(){
    val b: B = B()
    b.show()
}