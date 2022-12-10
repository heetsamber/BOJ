fun main(args:Array<String>){
    val x = 246_912
    val a = IntArray(x+1){1}
    a[0] = 0
    a[1] = 0
    for(i in 2..x) {
        if(a[i] == 1) {
            for(j in 2*i..x step i) { a[j] = 0}
        }
    }
    for(i in 2..x) {
        a[i] += a[i-1]
    }
    while(true){
        val n = readLine()!!.toInt()
        if(n==0) break
        println(a[2*n]-a[n])
    }
}
