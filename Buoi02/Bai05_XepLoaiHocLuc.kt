// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val diemTB: Double = 8.6
    val xepLoai = when (diemTB) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..8.49 -> "Giỏi"
        in 5.5..6.99 -> "Khá"
        in 4.0..5.49 -> "Trung bình"
        in 0.0..3.99 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }
    println("Điểm trung bình: $diemTB")
    println("Xếp loại học lực: $xepLoai")
}