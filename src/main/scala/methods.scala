def functionName(param1: Int, param2: String): String = {
  // old way
  return "Hello, World!"
}

def printStuff() = println(functionName(1, "Hello"))

def lastLineIsReturned(): Int =
  println("This is printed")
  1

def makeConnection(url: String, defaultValue: Int = 5000): Unit =
  println(s"url=$url, timeout=$defaultValue")

def doStuff2() =
  makeConnection("https://www.google.com")
  makeConnection("https://www.google.com", 1000)
  println(lastLineIsReturned())