package exam

fun main(){
    val name: String = "avd"
    val num: Int = 10
//    num = 5
    var num2 = 10
    num2 = 7
    println(name)
    println(num)
    println(num2)
    println("name is $name , num is $num")
    println(grade(96))

    for (i in 1..5) {
        if (i == 3) continue
        println(i)
    }
}

fun grade(marks: Int) : Int{

    return if (marks < 50) 0
    else {
        when {
            marks >= 91 -> 10
            marks in 81..90 -> 9
            marks in 71..80 -> 8
            else -> 7
        }
    }

}