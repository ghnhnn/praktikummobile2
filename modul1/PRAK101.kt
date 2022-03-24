fun main(){

    print("Waktu Sekarang: ")
    val waktu = readLine()
    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    val umur = readLine()!!.toInt()
    val suhu = (35 ..37)
    println(" ")
    println("Selamat $waktu, $nama.")
    println("Umur anda $umur.")
    println("Suhu tubuh anda ${suhu.random()!!.toFloat()} derajat celcius.")
}