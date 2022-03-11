fun main(args: Array<String>){
    //untuk literal number penunjukkan nilai (boxing) pada sebuah variabel tidak akan berpegaruh
    //pada identitas suatu variabel
    //Berikut contoh kode:
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a:" + (a===a))
    val boxedA : Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA:" + (boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA :" +(boxedA == anotherBoxedA))

}