object Suits extends Enumeration {

  type Suits = Value

  val Clover  = Value("♣")
  val Diamond = Value("♦")
  val Heart   = Value("♥")
  val Spade   = Value("♠")

}

import Suits._

def isRed(suite: Suits) = suite == Diamond || suite == Heart

println("Clover is red: "  + isRed(Clover))
println("Diamond is red: " + isRed(Diamond))
println("Heart is red: "   + isRed(Heart))
println("Spade is red: "   + isRed(Spade))
