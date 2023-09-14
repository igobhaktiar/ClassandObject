fun main() {
    // cara memanggil class dan membuat object Shape??
    val shape = Shape()
    // gimana cara memanggil variable didalam kelas??
    shape.name
    // cara memberikan nilai pada variable name di dalam kelas shape?
    shape.name = "Nama nya"
    // gimana cara memanggil function pada kelas shape?
    shape.main()
    shape.main

    val newMethodPrint = shape.print() // Proses Mencetak
    val newVariablePrint = shape.print

    // apakah funtion/method yang tanpa return bisa di tampung ke variable?
    val newMethodMain = shape.main()
}