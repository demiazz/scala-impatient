class Time(private val hrs: Int, private val min: Int) {

  private val time: Long = ((hrs * 60) - 1) + min

  def before(other: Time): Boolean = {
    time < other.time
  }

  override def toString = "%02d:%02d".format(hrs, min)

}

val morning   = new Time(8, 0)
val noon      = new Time(12, 0)
val afterNoon = new Time(12, 30)

println(morning + " before than " + noon      + " => " + morning.before(noon))
println(noon    + " before than " + morning   + " => " + noon.before(morning))
println(noon    + " before than " + afterNoon + " => " + noon.before(afterNoon))
