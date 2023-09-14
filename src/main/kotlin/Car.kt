class Car(
    // apakah boleh atau tidak variable pada primary constructor
    // diisi nilai null atau bahkan tidak diisi nilai???
    val name: String = "default",
    val model: String = "default",
    val new: Int? = null, // bisa pakai null, tapi harus pake '?'
    val none: String, // bisa, tapi harus di define tipe data nya
    // apakah bisa buat function pada constructor, TIDAK BISA!!!
) {
    // secara penerapan, apakah primary constructor....
    // bisa di gabung dengan secondary constructor??
    // bisa dengan syarat, secondary harus memanggil primary
    constructor(_model: String) : this(none = "") {

    }
    // optimalnya adalah, pilihan antara primary atau secondary
}