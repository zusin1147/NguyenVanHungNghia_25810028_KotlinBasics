// Nguyễn Văn Hùng Nghĩa - 25810028

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Động vật đang kêu..."
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu!"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo!"
    }
}

fun main() {
    val danhSachDongVat = listOf(
        Cho("Lu (Chó)"),
        Meo("Mimi (Mèo)")
    )

    for (dv in danhSachDongVat) {
        println("${dv.ten} kêu: ${dv.keu()}")
    }
}
Bài 07. Interface tính diện tích

Tên file: Bai07_InterfaceDienTich.kt
// Nguyễn Văn Hùng Nghĩa - 25810028

interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hinhVuong = HinhVuong(5.0)
    val hinhTron = HinhTron(3.0)

    println("Diện tích hình vuông: ${hinhVuong.tinhDienTich()}")
    println("Diện tích hình tròn: ${hinhTron.tinhDienTich()}")
}
Bài 08. Abstract class cho phương tiện di chuyển

Tên file: Bai08_AbstractPhuongTien.kt
// Nguyễn Văn Hùng Nghĩa - 25810028

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là $tocDoToiDa km/h.")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 220
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    print("Xe máy: ")
    xeMay.moTa()
    
    print("Ô tô: ")
    oTo.moTa()
}
Bài 09. Hai extension function cho String và Int

Tên file: Bai09_ExtensionFunction.kt
// Nguyễn Văn Hùng Nghĩa - 25810028

fun String.demNguyenAm(): Int {
    val nguyenAm = "ueoaiUEOAI"
    return this.count { it in nguyenAm }
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    val s1 = "Lập trình Kotlin"
    println("Số nguyên âm trong '$s1': ${s1.demNguyenAm()}")

    val n1 = 7
    println("$n1 là số nguyên tố? ${n1.laSoNguyenTo()}")
}
Bài 10. Data class cho sinh viên

Tên file: Bai10_DataClassSinhVien.kt
// Nguyễn Văn Hùng Nghĩa - 25810028

data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {
    val sv1 = SinhVien("25810028", "Nguyễn Văn Hùng Nghĩa", 8.5)
    val sv2 = SinhVien("25810028", "Nguyễn Văn Hùng Nghĩa", 8.5)

    println("Object sv1: $sv1")
    println("So sánh sv1 == sv2: ${sv1 == sv2}")

    val svMoi = sv1.copy(diemTrungBinh = 9.0)
    println("Object mới sau khi copy và sửa điểm: $svMoi")
}