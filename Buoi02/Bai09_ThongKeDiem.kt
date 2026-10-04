// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val bangDiem = doubleArrayOf(7.5, 8.0, 4.5, 9.0, 6.0, 3.5, 8.5)
    var tongDiem = 0.0
    var diemCaoNhat = bangDiem[0]
    var diemThapNhat = bangDiem[0]
    var soLuongDat = 0
    for (diem in bangDiem) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
        if (diem >= 5.0) {
            soLuongDat++
        }
    }
    val diemTrungBinh = tongDiem / bangDiem.size
    println("=== THỐNG KÊ ĐIỂM SỐ LỚP HỌC ===")
    println("Số lượng sinh viên: ${bangDiem.size}")
    println("Điểm trung bình: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
    println("Số lượng sinh viên đạt (>= 5.0): $soLuongDat")
}