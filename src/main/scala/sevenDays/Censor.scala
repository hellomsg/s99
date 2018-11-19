package sevenDays

trait Censor {
  val target = Map("Pucky" -> "Shoot", "Beans" -> "Darn")
  def replace(list: List[String]) : List[String] = {
    list.map(s => target.get(s) match {
      case Some(value) => value
      case None => s
    })
  }
}
