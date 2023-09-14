fun main() {
    // secara default car name dan car model nilainya "default"
    val carDefault = Car(none = "")
    carDefault.name
    println("Mobil saya bernama \"${carDefault.name}\", dan jenisny adalah \"${carDefault.model}\"")

    // percobaan constructor
    val carMine = Car(name = "Mine", model = "MPV", none = "none")
    carMine.name
    println("Mobil saya bernama \"${carMine.name}\", dan jenisny adalah \"${carMine.model}\"")


}