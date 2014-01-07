class UnitConversion {

  protected val factor: Double = 1.0;

  def convert(value: Double) = value * factor

}

object InchesToCentimeters extends UnitConversion {
  override protected val factor = 2.54
}

object GallonsToLiters extends UnitConversion {
  override protected val factor = 3.78541178
}

object MilesToKilometers extends UnitConversion {
  override protected val factor = 1.609344
}

println(InchesToCentimeters.convert(1.0) + " centimeters")
println(InchesToCentimeters.convert(5.0) + " centimeters")

println(GallonsToLiters.convert(1.0) + " liters")
println(GallonsToLiters.convert(5.0) + " liters")

println(MilesToKilometers.convert(1.0) + " kilometers")
println(MilesToKilometers.convert(5.0) + " kilometers")
