package sevenDays

import scala.io.Source
import scala.actor

object Main extends App with Censor {
  def totalLength(list: List[String]): Int = {
    list.foldLeft(0)((size, s) => size + s.length)
  }

//  val list = List("Dan", "Wardz", "Pucky", "Beans")
  val list = Source.fromFile("/Users/wangbinbin/git/s99/src/main/resources/list.txt").getLines().toList
  println(totalLength(list))
  println(replace(list))
}
