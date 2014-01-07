object Suite extends Enumeration {

  type Suite = Value

  val Clover  = Value("♣")
  val Diamond = Value("♦")
  val Heart   = Value("♥")
  val Spade   = Value("♠")
}

println(Suite.values)
