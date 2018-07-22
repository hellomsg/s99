package lists

object P20 {
  def removeAt[A](n: Int, ls: List[A]): List[A] =
    (ls take n) ::: (ls drop n + 1)

  def removeAt2[A](n: Int, ls: List[A]): (List[A], A) = ls splitAt(n) match {
    case (Nil, _) => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }
}