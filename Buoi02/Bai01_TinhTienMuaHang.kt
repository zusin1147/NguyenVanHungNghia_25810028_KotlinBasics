// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028
fun main(){
    val soLuong: Int = 5
    val donGia: Double = 125000.0
    val tienHang: Double = soLuong.toDouble() * donGia
    val thueVAT: Double = tienHang * 0.08
    val tongTien: Double = tienHang + thueVAT
    
    println("HÓA ĐƠN MUA HÀNG")
    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế VAT (8%): $thueVAT VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}