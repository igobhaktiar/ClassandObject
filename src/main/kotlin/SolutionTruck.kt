fun main() {
    val isuzu = Truck(name = "isuzu", model = "Container")
    val udTruck = Truck(engine = "Diesel Twin Turbo")
    val truckDefault = Truck() // memanggil nilai default

    println("Nama truck adalah \"${isuzu.name}\", model \"${isuzu.model} \"")
    println("Nama truck adalah \"${udTruck.name}\", model \"${udTruck.model} \"")
    println("Nama truck adalah \"${truckDefault.name}\", model \"${truckDefault.model} \"")

}