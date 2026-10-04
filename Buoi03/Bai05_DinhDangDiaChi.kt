//Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun dinhDangDiaChi(soNha: String, tenDuong: String, phuong: String = "Phường Bến Nghé", quan: String = "Quận 1", thanhPho: String = "TP. Hồ Chí Minh") {
    println("Địa chỉ: $soNha, đường $tenDuong, $phuong, $quan, $thanhPho")
}

fun main() {
    dinhDangDiaChi("123", "Lê Lợi", phuong = "Phường Bến Thành", quan = "Quận 1", thanhPho = "TP. Hồ Chí Minh")
}