fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr: IntArray = IntArray(10)
    val isUsed: Array<Boolean> = Array<Boolean>(10) { i -> false }
    fun sol(c: Int) {
        if (c == m) {
            for (i in 0 until m) {
                print("${arr[i]} ")
            }
            println()
            return
        }
        var start = 1
        if (c != 0) {
            start = arr[c - 1] + 1
        }
        for (i in start..n) {
            if (!isUsed[i]) {
                arr[c] = i
                isUsed[i] = true
                sol(c + 1)
                isUsed[i] = false
            }
        }
    }
    sol(0)
}


