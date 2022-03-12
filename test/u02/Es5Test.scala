package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import Es5._

class Es5Test

  val sum: (Int, Int) => Int = _+_
  val prod: (Int, Int) => Int = _*_

  @Test def testCompose() : Unit =
    assertEquals(compose(_-1,_*2)(5), 9)

  @Test def testComposeGen() : Unit =
    assertEquals(composeGen(sum (_,-1), prod(_,2))(5), 9)

  @Test def testSum() : Unit =
    assertEquals(sum(3,2), 5)

  @Test def testProd() : Unit =
    assertEquals(prod(3,2), 6)