fun rumus(x: Int): Int{
    var hasil = 2*(x*x)+5*x-8
    return hasil
}
fun main() {
    print("Nilai x = ")
    val x = readLine()!!.toInt()
    println(rumus(x))
}
