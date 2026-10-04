//Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val dienTich1 = tinhDienTich(5.0, 3.0)
val dienTich2 = tinhDienTich(10.5, 4.0)

fun main() {
    println("Diện tích 1: $dienTich1")
    println("Diện tích 2: $dienTich2")
}