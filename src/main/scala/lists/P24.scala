package lists

/**
  * Created by wangbinbin on 2018/7/23.
  */
object P24 {
  import P23.randomSelect
  def lotto(n: Int, e: Int): List[Int] =
    randomSelect(n, List.range(1, e + 1))
}
