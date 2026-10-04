// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val canNang: Double = 65.0
    val chieuCao: Double = 1.70

    val bmi: Double = canNang / (chieuCao * chieuCao)
    var phanLoai: String = ""

    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Cân nặng: $canNang kg")
    println("Chiều cao: $chieuCao m")
    println("Chỉ số BMI: $bmi")
    println("Phân loại: $phanLoai")
}