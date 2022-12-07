import java.util.Stack

fun main(args: Array<String>){
    val str = readLine()!!
    var cnt : Int = 0
    val S = Stack<Char>()

    for(i in 0 until str.length){
        if(str[i] == '('){
            S.push(str[i]);
        }else if(str[i] == ')' && str[i-1] == '('){    // 레이저 일떄
            S.pop()
            cnt += S.size
        }else{
            cnt++
            S.pop()
        }
    }
    println(cnt)
}
