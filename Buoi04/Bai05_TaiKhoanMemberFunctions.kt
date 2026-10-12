// Nguyễn Văn Hùng Nghĩa - 25810028

class TaiKhoanNganHang(val soTaiKhoan: String, val soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản $soTaiKhoan thành công với số dư: $soDuBanDau")
        }
    }

    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nạp thành công $soTien. Số dư mới: $soDu")
        } else {
            println("Số tiền nạp không hợp lệ!")
        }
    }

    fun rutTien(soTien: Double): Boolean {
        return if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien
            println("Rút thành công $soTien. Số dư còn lại: $soDu")
            true
        } else {
            println("Rút tiền thất bại! Số dư không đủ hoặc số tiền không hợp lệ.")
            false
        }
    }
}

fun main() {
    val tk = TaiKhoanNganHang("ACC999", 2000.0)
    tk.napTien(500.0)
    tk.rutTien(1000.0)
    tk.rutTien(2000.0)
}