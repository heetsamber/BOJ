fun main(){
    var (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val sum = n1 * n2; var temp : Int
    while(n2 != 0) { temp = n1 % n2;n1 = n2;n2 = temp }
    print("${n1}\n${sum/n1}")
}
