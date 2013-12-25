def lteqgt(values: Array[Int], v: Int) = (
  values.filter(_ < v).size,
  values.filter(_ == v).size,
  values.filter(_ > v).size
)

val values = Array(2, 1, 3, 4, 6, 5)
val triple = lteqgt(values, 3)

println("LT: " + triple._1)
println("EQ: " + triple._2)
println("GT: " + triple._3)
