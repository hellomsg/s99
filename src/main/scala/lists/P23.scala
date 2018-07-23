package lists

object P23 {
  import P20.removeAt2
  def randomSelect[A](n: Int, ls: List[A]): List[A] = n match {
    case x if (x <= 0) => Nil
    case _ => {
      val (rest, e) = removeAt2((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect(n - 1, rest)
    }
  }

  def randomSelectRecursiveTail[A](n: Int, ls: List[A]): List[A] = {
    def randomSelectRecursiveR[A](n: Int, ls: List[A], r: util.Random, result: List[A]): List[A] = n match {
      case x if (x <= 0) => result
      case _ => {
        val (rest, e) = removeAt2(r.nextInt(ls.length), ls)
        randomSelectRecursiveR(n - 1, rest, r, e :: result)
      }
    }
    randomSelectRecursiveR(n, ls, new util.Random, Nil)
  }
}