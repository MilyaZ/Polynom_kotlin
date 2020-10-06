package ru.milya

fun main(){
    println("Hello, World!")
    var x =9
    var y: Int
    val a = -2 //const, в том смысле что не меняется указатель на его область памяти, но значение внутри этой памяти можем менять
    //рекомендуется использовать val , если оно не будет меняться
    val c1= doubleArrayOf(1.0,3.0,3.0,5.0,0.0)
    val c2= doubleArrayOf(0.0,0.0,-3.0)
    val c3= doubleArrayOf(1.0,2.0,3.0)
    val p1 = Polynom(c1)
    val p2 = Polynom(c2)
    val p3 = p1+p2
val l1 = Newton(mutableMapOf(0.0 to 0.0))
    l1.add(-1.0 to 1.0)
   // l1.add(0.0 to 0.0)
    l1.add(1.0 to 1.0)

    /*
    l1.add(0.0 to -1.0)
    l1.add(1.0 to 1.0)
    l1.add(0.5 to 1.0)
    -1.0 to 1.0,
    0.0 to 0.0,
    1.0 to 1.0
    */
    println(l1)
    println("-----")
    println(p1)
    println(p2)
    println(p2+p1)
    println(p1(3.0))
    val w =MainWindow()
    w.isVisible = true //чтобы показать окно
}