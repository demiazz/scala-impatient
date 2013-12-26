class BankAccount {

  private var _balance = 0.0

  def deposit(money: Double) = _balance += money

  def withdraw(money: Double) = _balance -= money

  def balance = _balance

  override def toString = "Balance: " + balance

}

val account = new BankAccount

println(account)
account.deposit(20000)
println(account)
account.withdraw(10000)
println(account)
