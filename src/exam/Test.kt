package exam

fun main(){
    for (i in 1..20){
        println(i)
    }
    var x: Int = 10
    while (x > 0){
        println(x--)
    }

    var list = mutableListOf("a","b","c","d","e")
    list.removeAt(1)
    list.add(1, "f")
    list.add("g")

    println(list)

    var map = mapOf("shizuka" to 90, "doraemon" to 80, "nobita" to 7)
    for ((key, value) in map){
        if(value > 50){
            println(key)
        }
    }

    val nums = mutableListOf(1,2,3,4,5,6)
    val odd = {list : MutableList<Int> -> list.filter { it % 2 == 1 }}
    println(odd(nums))

}