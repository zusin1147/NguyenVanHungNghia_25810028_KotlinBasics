//Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028


fun ghiNhatKy1(hanhDong: String): Unit {
    println("[LOG 1]: $hanhDong")
}

fun ghiNhatKy2(hanhDong: String) {
    println("[LOG 2]: $hanhDong")
}
// Hai cách viết hoàn toàn tương đương vì khi hàm không trả về giá trị có ý nghĩa, Kotlin tự động mặc định kiểu trả về là Unit và cho phép lược bỏ từ khóa này.

fun main() {
    ghiNhatKy1("Người dùng đăng nhập")
    ghiNhatKy2("Người dùng đăng nhập")
}