fun main(args: Array<String>){
    //Selain memiliki literal konstan kotlin juga dapat menggunakan underscore dalam literal, untuk
    //memberikan kemudahan pada pengembang dalam membaca dan menulis kode program
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_346L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("oneBillion =" + oneMillion)
    println("creditCardNumber =" + socialSecurityNumber)
    println("hexBytes=" + hexBytes)
    println("bytes=" + bytes)

}