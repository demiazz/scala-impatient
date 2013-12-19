def orderByPositive(a: Array[Int]) = a.filter(_ > 0) ++ a.filter(_ <= 0)

val a = Array(11, 3, -10, 21, 22, -34, 0, -10, -40, 56, -32)
val result = orderByPositive(a)

println(a.mkString(", "))
println(result.mkString(", "))
