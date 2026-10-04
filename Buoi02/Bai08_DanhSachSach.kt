// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val danhSachSach = mutableListOf(
        "Lập trình Kotlin căn bản",
        "Lập trình Android với Kotlin",
        "Cấu trúc dữ liệu và giải thuật"
    )

    println("=== DANH SÁCH SÁCH BAN ĐẦU ===")
    for (i in danhSachSach.indices) {
        println("${i + 1}. ${danhSachSach[i]}")
    }
    val sachMoi = "Thiết kế giao diện Mobile"
    danhSachSach.add(sachMoi)
    println("\n-> Đã thêm sách mới: $sachMoi")

    val sachCanXoa = "Cấu trúc dữ liệu và giải thuật"
    danhSachSach.remove(sachCanXoa)
    println("-> Đã xóa sách: $sachCanXoa")
    println("\n=== DANH SÁCH SÁCH SAU KHI CẬP NHẬT ===")
    for (i in danhSachSach.indices) {
        println("${i + 1}. ${danhSachSach[i]}")
    }
}