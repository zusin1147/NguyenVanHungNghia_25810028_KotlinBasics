// Nguyễn Văn Hùng Nghĩa - 25810028

class TaiKhoanNganHang(val soTaiKhoan: String, val soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản thành công! Số dư ban đầu: $soDuBanDau")
        }
    }
}

fun main() {
    val tk1 = TaiKhoanNganHang("ACC001", 1500000.0)
    val tk2 = TaiKhoanNganHang("ACC002", -200000.0)
}