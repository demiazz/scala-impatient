class Car(
  val manufacturer: String,
  val modelName:    String,
  val modelYear:    Int = -1,
  var licensePlate: String = ""
  ) {

  override def toString = {
    "Manufacturer: " + manufacturer + "; Model: " + modelName +
    "; Year: " + modelYear + "; License Plate: " + licensePlate
  }

}

val lada   = new Car("Lada", "2110", 2005, "RU 204")
val mazda  = new Car("Mazda", "RX 7", 2004)
val nissan = new Car("Nissan", "Skyline")

println(lada)
println(mazda)
println(nissan)

lada.licensePlate = "UA 203"

println(lada)
