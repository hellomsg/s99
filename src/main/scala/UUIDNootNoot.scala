import java.util.UUID

abstract class UUIDNootNoot {
  type NOOT

  def random: NOOT = {
    UUID.randomUUID().asInstanceOf[NOOT]
  }

  def toUUID(n: NOOT): UUID = n.asInstanceOf[UUID]

  def fromString(value: String): Either[IllegalArgumentException, UUID] =
    try Right(UUID.fromString(value)) catch {
      case e: IllegalArgumentException => Left(e)
    }
}

object Id1 extends UUIDNootNoot

type Id1 = Id1.NOOT

object Id2 extends UUIDNootNoot

type Id2 = Id2.NOOT

def a(i: Id1): UUID = Id1.toUUID(i)
