// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val danhSachKhachHang: List<String?> = listOf(
        "Nguyen Van A",
        null,
        "Tran Thi B",
        null,
        "   "
    )
    println("=== DANH SÁCH KHÁCH HÀNG SAU KHI XỬ LÝ ===")
    for (kh in danhSachKhachHang) {
        // Dùng toán tử an toàn ?. kết hợp Elvis ?: để xử lý giá trị null
        // Nếu tên null hoặc chuỗi rỗng/chỉ chứa khoảng trắng thì lấy giá trị mặc định là "Khách vãng lai"
        val tenHopLe: String = if (kh != null && kh.trim().isNotEmpty()) {
            kh.trim()
        } else {
            "Khách vãng lai"
        }
        val doDaiTen: Int = kh?.trim()?.length ?: 0
        println("Tên khách hàng: $tenHopLe (Độ dài: $doDaiTen ký tự)")
    }
}