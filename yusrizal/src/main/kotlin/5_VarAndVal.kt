//kata kunci var di kotlin di gunakan untuk mendeklarasikan variabel yang nilainya dapat berubah-ubah
//sepanjang program dieksekusi. Sedangkan kata kunci val digunakan untuk mendeklarasikan
//variabel konstan yang nilainya tidak akan di berubah selama program dieksekusi
fun main(args: Array<String>){
    var varVariabel: Int
    varVariabel = 56 //assigning first value to varVariabel
    println("pemberian nilai pertama pada varVariabel = $varVariabel")
    varVariabel = 78 //assigning second value to varVariabel
    println("pemberian nilai kedua pada variabel = $varVariabel")
    var phi = 3.14
    phi = 2.5
}