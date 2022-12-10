fun main(args:Array<String>){
    val X = 500000
    val a = IntArray(X+1){1}
    a[0] = 0
    a[1] = 0
    for(p in 2..X) {
        if(a[p] == 1) {
            for(j in 2*p..X step p) {
                a[j] = 0
            }
        }
    }
    for(i in 2..X) {
        a[i] += a[i-1]
    }
    while(true){
        val n = readLine()!!.toInt()
        if(n==0) break
        println(a[2*n]-a[n])
    }
}
