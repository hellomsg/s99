package lists

object P19 {
  def rotate[A](n: Int, ls: List[A]): List[A] = n match {
    case x if(x > 0) => (ls drop n) ::: (ls take n)
    case x if(x < 0) => (ls splitAt (ls.length + x))._2 ::: (ls take ls.length + x)
    case _ => ls
  }
}