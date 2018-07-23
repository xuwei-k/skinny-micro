package skinny.micro.util

class DefaultMap[A, +B] extends scala.collection.immutable.Map[A, B] {
  override def remove(key: A): Map[A, B] = {
    val b = Map.newBuilder[A, B]
    for (kv <- this; if kv._1 != key) b += kv
    b.result()
  }
  override def updated[B1 >: B](key: A, value: B1): Map[A, B1] = {
    val b = Map.newBuilder[A, B1]
    b ++= this
    b += ((key, value))
    b.result()
  }
}
