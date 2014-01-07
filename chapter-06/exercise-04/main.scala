class Point(x: Int, y: Int) extends java.awt.Point(x, y) {

  override def toString = "x: " + x + "; y: " + y + ";"

}

object Point {

  def apply(x: Int, y: Int) = new Point(x, y)

}

val point = new Point(5, 10)

println(point)
