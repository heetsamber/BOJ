fun main(){
    val t = readln().toInt()
    var n : Int = 0; var cnt : Int; var max = 0
    val arr = arrayListOf<Int>()
    for(i in 0 until t){
        n = readln().toInt()
        arr.add(n)
        if(n > max) {max = n}
    }
    val dp = Array(max+1){0}
    dp[1] = 1; dp[2] = 2; dp[3] = 4
    for(i in 4 .. max){ dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] }
    arr.forEach{println(dp[it])}
}
