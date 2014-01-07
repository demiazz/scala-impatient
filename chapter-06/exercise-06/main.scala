object Suits extends Enumeration {

  type Suits = Value

  val Clover  = Value("♣")
  val Diamond = Value("♦")
  val Heart   = Value("♥")
  val Spade   = Value("♠")
}

println(Suits.values)
