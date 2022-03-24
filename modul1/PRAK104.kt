class Pekerjaan(val nama: String, val job: String){
    fun tampil(){
        println("Nama Barang: $nama")
        println("Pekerjaan: $job")
    }
}

fun main(args: Array<String>){
    val pkj = Pekerjaan ("Anton", "CEO")
    pkj.tampil()

}