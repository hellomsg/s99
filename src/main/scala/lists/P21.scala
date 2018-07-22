package lists

object P21 {
  def insertAt[A](n: Int, item: A, ls: List[A]): List[A] = ls.splitAt(n) match {
    case (pre, post) => pre ::: item :: post
  }
}