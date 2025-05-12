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
/*
public (default)

private (within the file or class)

protected (subclasses only)

internal (within the module)
 */
internal class MyClass {
    private val secret = "Hidden"
    protected open val id = 101
}


fun main(){
    val b: B = B()
    b.show()
}