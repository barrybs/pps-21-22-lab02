package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

object Es1 extends App{
  //EX 1a: parity - part 1
  val parity: Int => String =
    case n if (n%2) == 0 => "even"
    case _  => "odd"

  //EX 1a: parity - part 2
  def parityDef (n: Int): String = n match
    case n if (n%2) == 0 => "even"
    case _ => "odd"
  
}
