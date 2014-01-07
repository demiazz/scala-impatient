object Conversions {
  def inchesToCentimeters(inches: Double) = inches  * 2.54
  def gallonsToLiters(gallons: Double)    = gallons * 3.78541178
  def milesToKilometers(miles: Double)    = miles   * 1.609344
}

println(Conversions.inchesToCentimeters(1.0) + " centimeters")
println(Conversions.inchesToCentimeters(5.0) + " centimeters")

println(Conversions.gallonsToLiters(1.0) + " liters")
println(Conversions.gallonsToLiters(5.0) + " liters")

println(Conversions.milesToKilometers(1.0) + " kilometers")
println(Conversions.milesToKilometers(5.0) + " kilometers")
