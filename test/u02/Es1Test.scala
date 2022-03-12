package u02

import org.junit.*
import Es1.*
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class Es1Test
  //Tests for Es 1a
  @Test def testParity(): Unit =
    assertEquals("even", parity(2))
    assertEquals("odd", parity(1))

  @Test def testParityDef(): Unit =
    assertEquals("even", parityDef(2))
    assertEquals("odd", parityDef(1))






