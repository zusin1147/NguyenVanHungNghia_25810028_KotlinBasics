// Nguyễn Văn Hùng Nghĩa - 25810028

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    
    constructor(ten: String) : this("TAM", ten, 0.0)

    init {
        // println(maNhanVien)
    }
}

fun main() {
    val nv1 = NhanVien("NV01", "Nguyễn Văn An", 12000000.0)
    val nv2 = NhanVien("Trần Bình")

    println("NV1 - Tên: ${nv1.ten}, Lương: ${nv1.luongThang}")
    println("NV2 - Tên: ${nv2.ten}, Lương: ${nv2.luongThang}")
}