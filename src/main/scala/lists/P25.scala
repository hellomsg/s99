package lists

import scala.reflect.ClassTag

/**
  * Created by wangbinbin on 2018/7/23.
  */
object P25 {
  import P23.randomSelectRecursiveTail
  def randomPermute[A](ls: List[A]): List[A] =
    randomSelectRecursiveTail(ls.length, ls)

  def randomPermute2[A:ClassTag](ls: List[A]): List[A] = {
    val rand = new util.Random
    val a = ls.toArray
    for (i <- a.length - 1 to 1 by -1) {
      val i1 = rand.nextInt(i + 1)
      val t = a(i)
      a.update(i, a(i1))
      a.update(i1, t)
    }
    a.toList
  }

  def randomPermute3[A](ls: List[A]): List[A] = Nil
}
