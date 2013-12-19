import collection.mutable.ArrayBuffer

val a = Array(2, 5, 1, 4, 3)
val b = ArrayBuffer(2, 5, 1, 4, 3)

println(a.sortWith(_ > _).mkString(", "))
println(b.sortWith(_ > _).mkString(", "))
