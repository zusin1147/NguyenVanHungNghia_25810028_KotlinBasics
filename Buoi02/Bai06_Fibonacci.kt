// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val fibList = mutableListOf(0, 1)
    for (i in 2..100) {
        val nextFib = fibList[i - 1] + fibList[i - 2]
        if (nextFib >= 100) {
            break
        }
        fibList.add(nextFib)
    }

    println("Danh sách các số Fibonacci nhỏ hơn 100:")
    for (i in fibList.indices) {
        println("Vị trí $i: ${fibList[i]}")
    }
}