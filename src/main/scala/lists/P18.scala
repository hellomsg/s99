package lists

object P18 {
  def slice[A](i: Int, k: Int, ls: List[A]): List[A] = {
    def sliceR[A](i: Int, k: Int, ls: List[A], result: List[A]): List[A] = (i, k, ls) match {
      case (_, 0, _) => result
      case (_, _, Nil) => result
      case (0, _, _) => sliceR(0, k - 1, ls.tail, result :+ ls.head)
      case (s, _, _) if (s < 0) => sliceR(0, k, ls, List())
      case _ => sliceR(i - 1, k - 1, ls.tail, result)
    }
    sliceR(i, k, ls, List())
  }
  def sliceBuiltin[A](i: Int, k: Int, ls: List[A]): List[A] =
    ls.slice(i, k)

  def sliceFunctional[A](i: Int, k: Int, ls: List[A]): List[A] =
    ls drop i take (k - (i max 0))
}