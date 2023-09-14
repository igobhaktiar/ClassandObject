class Shape { // gunakan PascalCase not camelCase
    var luas: Int = 0
    var name: String = ""

    fun transform(): Unit {
        return
    }
    fun print(): String {
        return "Proses Mencetak"
    }
    fun solution() {}
    // apakah di dalam kelas boleh bikin fun main ????
    fun main() {
        // boleh,
        // tetapi dia tidak bisa sebagai runner untuk compile and run
    }

    // apakah bisa kita bikin variable dan funtion
    // dengan nama yang sama pada satu class?
    val main: String = ""
    val print: String = "Proses Mencetak"
}