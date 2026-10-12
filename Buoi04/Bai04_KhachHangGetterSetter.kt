// Nguyễn Văn Hùng Nghĩa - 25810028

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split("\\s+".toRegex())
            if (parts.size >= 2) {
                ho = parts.first()
                ten = parts.last()
            } else if (parts.size == 1) {
                ten = parts[0]
            }
        }
}

fun main() {
    val kh = KhachHang("Nguyễn", "An")
    println("Họ tên ban đầu: ${kh.hoTen}")

    kh.ten = "Bình"
    println("Họ tên sau khi đổi tên: ${kh.hoTen}")

    kh.hoTen = "Trần Văn Cường"
    println("Họ: ${kh.ho}")
    println("Tên: ${kh.ten}")
    println("Họ tên đầy đủ: ${kh.hoTen}")
}