// Nguyễn Văn Hùng Nghĩa - 25810028

class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {
    val sp1 = SanPham("Laptop Gaming", 25000000.0, 15)
    val sp2 = SanPham(tenSanPham = "Bàn phím cơ", gia = 1200000.0)

    println("Sản phẩm 1: ${sp1.tenSanPham} - Giá: ${sp1.gia} - Tồn kho: ${sp1.soLuongTonKho}")
    println("Sản phẩm 2: ${sp2.tenSanPham} - Giá: ${sp2.gia} - Tồn kho: ${sp2.soLuongTonKho}")
}