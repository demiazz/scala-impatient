def minmax(values: Array[Int]) = (values.min, values.max)

val values = Array(2, 1, 3, 4, 6, 5)
val pair   = minmax(values)

println("Min: " + pair._1)
println("Max: " + pair._2)
