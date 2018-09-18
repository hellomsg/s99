/**
  * Created by wangbinbin on 2018/7/20.
  */
import lists._
object Main extends App{
  override def main(args: Array[String]): Unit = {
    val withDefault: Option[Int] => Int = { case Some(x) => x case None => 0 }
  }


  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) =
		if (a < b) a else b

  def test = "a" ++ "b"
}
