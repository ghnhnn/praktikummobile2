fun main(){
    print("Input Bilangan: ")
    val x = readLine()!!.toInt()
    val i : Int = x
    for (i in 1..8){
        val hasil = x * i
        if (hasil%2==0 || hasil%3==0)
            print("$hasil ")
    }
}