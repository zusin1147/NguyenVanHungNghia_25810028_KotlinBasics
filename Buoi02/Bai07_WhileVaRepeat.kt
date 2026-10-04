// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    println("--- BẮT ĐẦU ĐẾM NGƯỢC ---")
    var dem = 10
    while (dem >= 1) {
        println(dem)
        dem--
    }
    println("Bắt đầu!\n")
    println("--- LẶP THÔNG ĐIỆP BẰNG REPEAT ---")
    repeat(3) { lan ->
        println("Lần ${lan + 1}: Chúc các bạn học tốt Kotlin!")
    }
}