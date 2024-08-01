import scala.io.StdIn.readLine

def input() =
  println("What's your name?")
  val name = readLine()
  println(s"Hello, $name!")


def variables() =
  val a = 1
  var b = 2
  b = b + a
  println(b)

def differentVariables() =
  val a:Int = 1
  val b:Double = 2.0
  val c:Char = 'c'
  val d:Boolean = true
  val e:String = "hello"
  val f:Unit = print("hello")
  val g:BigInt = BigInt("1234567890")
  val h:BigDecimal = BigDecimal("123456.789")
  val j:Byte = 127
  val k:Short = 32767
  val l:Long = 1234567890
  val m:Float = 1.23456789f
  val n:List[Int] = List(1, 2, 3)

def lambda() =
  val addOne = (x: Int) => x + 1
  println(addOne(1))

def pipeline() =
  val addOne = (x: Int) => x + 1
  val timesTwo = (x: Int) => x * 2
  val addOneAndTimesTwo = addOne andThen timesTwo
  println(addOneAndTimesTwo(1))

def prints() =
  println("Hello, world!")
  print("Hello, world!")
  println()
  
  val s1 = "String1"
  val a = 1
  val b = 2
  
  // instead of python f"", use s""
  println(s"This is similar to JS: $s1 ${a + b}")
  
  val multilineString = """
    This is a multiline string
    """
  
  println(multilineString)

def ifelse() =
  val a = 1
  val b = 2
  
  println(if a > b then a else b)
  
  if a > b then {
    println(a)
  } else {
    println(b)
  }

def forLoops() =
  val list = List(1, 2, 3)
  
  for i <- list do println(i) // i <- list is a generator
  
  for i <- list do {
    println(i)
    println("hello")
  }

  for // multiple generators
    i <- list // generator
    if i > 2 // filter aka guard
  do // start of the body
    println(i) // body
  
  for
    i <- 1 to 3 
    j <- 'a' to 'c'
    if i == 2 // multiple guards
    if j == 'b'
  do
    println(s"i = $i, j = $j")   // prints: "i = 2, j = b"

def forExpressions() =
  val numbers = for i <- 1 to 3 yield i * 2
  println(numbers) // List(2, 4, 6)

  val strings = for str <- List("a", "b", "c") yield str.capitalize
  println(strings) // List("A", "B", "C")

  val fruitLengths = for
    f <- List("apple", "banana", "cherry", "watermelon", "grape", "kiwi")
    if f.length > 5
  yield
    f.length
  print(fruitLengths) // List(6, 6, 10)

  val numbers2 = for
    i <- 1 to 3
    j <- 'a' to 'c' 
  yield s"i = $i, j = $j"
  println(numbers2) // List("i = 1, j = a", "i = 1, j = b", ...)

def matchExpressions() =
  // java equivalent of switch
  val i = 1
  val result = i match
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  println(result)

  // more complex use of match
  def getClassAsString(x: Matchable): String = x match
    case s: String => s"'$s' is a String"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[?] => "List"
    case _ => "Unknown"

  // examples
  println(s"1 ${getClassAsString(1)}")
  println(s"hello ${getClassAsString("hello")}")
  println(s"List ${getClassAsString(List(1, 2, 3))}")

def tryCatch() =
  try
    val a = 1 / 0
  catch
    case e: ArithmeticException => println("ArithmeticException")
    case e: Exception => println("Exception")  

@main def run() =
  // input()
  variables()
  differentVariables()
  lambda()
  pipeline()
  prints()

