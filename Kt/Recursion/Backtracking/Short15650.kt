fun main()=with(System.`in`.bufferedReader()){
    val n=read()-48;skip(1);val m=read()-48
    fun a(d:Int,c:Int,s:String){if(d==m)println(s)else for(i in c..n)a(d+1,i+1,"$s$i ")}
    a(0, 1, "")
}
