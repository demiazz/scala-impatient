class Time(val hrs: Int, val min: Int) {

  def before(other: Time): Boolean = {
    hrs < other.hrs || (hrs == other.hrs && min < other.min)
  }

  override def toString = "%02d:%02d".format(hrs, min)

}

val morning   = new Time(8, 0)
val noon      = new Time(12, 0)
val afterNoon = new Time(12, 30)

println(morning + " before than " + noon      + " => " + morning.before(noon))
println(noon    + " before than " + morning   + " => " + noon.before(morning))
println(noon    + " before than " + afterNoon + " => " + noon.before(afterNoon))
