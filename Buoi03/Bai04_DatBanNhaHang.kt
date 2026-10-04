//Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028
fun datBan(tenKhach: String, soLuongKhach: Int, loaiBan: String = "bàn thường") {
    println("Khách: $tenKhach, Số lượng: $soLuongKhach, Loại bàn: $loaiBan")
}



fun main() {
    datBan("Nguyễn Văn A", 4)


    datBan("Trần Thị B", 2, "bàn VIP")
    datBan(tenKhach = "Lê Văn C", soLuongKhach = 6, loaiBan = "bàn ngoài trời")
}
