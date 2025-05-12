package exam

open class Animal {
    open fun speak() = println("Animal sound")
}

class Dog : Animal() {
    override fun speak() = println("Bark")
}

class Cat: Animal(){

}

fun main(){
    val dog:Dog = Dog()
    val cat:Cat = Cat()
    dog.speak()
    cat.speak()
}