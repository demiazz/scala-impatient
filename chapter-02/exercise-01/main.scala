def signum(x: Int) = {
  if (x > 0) { 1
  } else if (x < 0) -1 else 0
}

println("Signum for 10 is "  + signum(10))
println("Signum for -10 is " + signum(-10))
println("Signum for 0 is "   + signum(0))
