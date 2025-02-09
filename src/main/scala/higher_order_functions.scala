val a = List(1, 2, 3)

val b = a.map(x => x + 1)
val c = a.filter(x => x > 1)
val d = a.filter(_ > 1)
val e = a.reduce((x, y) => x + y - 1)

val f = a.fold(0, (x: Int, y: Int) => x + y - 1)
val g = a.fold(0)((x:Int, y:Int) => x + y - 1)
val h = a.fold(0)(_ + _ + 2)

val i = a.foldLeft(0)((x: Int, y: Int) => x + y - 1)
val j = a.foldLeft(0)(_ + _ - 1)

val k = a.foldRight(0)((x: Int, y: Int) => x + y - 1)
val l = a.foldRight(0)(_ + _ - 1)

def addOne(x: Int): Int = x + 1
val m: List[Int] = a.map(addOne)

val _ = println(b) // List(2, 3, 4)
val _ = println(c) // List(2, 3)
val _ = println(d) // List(2, 3)
val _ = println(e) // 6