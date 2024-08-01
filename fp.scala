enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

import CrustSize.*

def dothings() =
  val currentCrustSize = Small

  // enums in a `match` expression
  currentCrustSize match
  case Small => println("Small crust size")
  case Medium => println("Medium crust size")
  case Large => println("Large crust size")

  // enums in an `if` statement
  if currentCrustSize == Small then println("Small crust size")


case class Person(name: String, age: Int)

def doStuff() =
  val p = Person("John", 35)
  println(p) // Person(John,35)
  println(p.name) // John
  println(p.age) // 35

  val p2 = p.copy(name = "Jane") // copy with a new name
  println(p2) // Person(Jane,35)
