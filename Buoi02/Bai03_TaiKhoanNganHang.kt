// Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028
//val không được thay đổi biến, var có thể thay đổi biến 
fun main() {
    val soDuBanDau: Double = 5000000.0
    var soDu: Double = soDuBanDau
    println("So du ban dau: $soDuBanDau VND")

    val tienGui: Double = 2000000.0
    soDu += tienGui
    println("Gui them: $tienGui VND -> So du hien tai: $soDu VND")

    val tienRut: Double = 1500000.0
    soDu -= tienRut
    println("Rut ra: $tienRut VND -> So du hien tai: $soDu VND")
}
