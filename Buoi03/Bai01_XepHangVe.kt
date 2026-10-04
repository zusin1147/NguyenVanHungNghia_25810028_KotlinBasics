//Họ tên: Nguyễn Văn Hùng Nghĩa - MSSV: 25810028

fun main() {
    val tuoi = 20
    val loaiVe = if (tuoi<6){
        "Vé trẻ em"
    }
    else if(tuoi<=60)
    {
        "Vé người lớn"
    }
    else
    {
        "Vé cao tuổi"
    }
    println("Loại vé: $loaiVe")
}