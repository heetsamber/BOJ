import kotlin.collections.ArrayDeque

fun main(args: Array<String>){
    val (n, k) = readln().split(" ").map { it.toInt() }
    val Q : ArrayDeque<Int> = ArrayDeque()

    for(i in 1..n){ Q.add(i) }
    print('<')
    
    while(!Q.isEmpty()){
        for(i in 0..k-2){
            Q.add(Q.first())
            Q.removeFirst()
        }
        print(Q.first())
        Q.removeFirst()

        if(Q.size > 0){ print(", ")}
    }
    
    print(">")
}
