package base

class TC[T]

object TC {
  implicit def apply[T] = new TC[T]

  val lzWorks = shapeless.Lazy.mkLazy[TC[Int]]
}

