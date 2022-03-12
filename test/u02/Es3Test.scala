package u02

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import Es3.*

class Es3Test
  //Tests for Es 1c
  @Test def testNonEmptyGeneric() : Unit =
    assertFalse(notEmptyGeneric(""))
    assertTrue(notEmptyGeneric("a"))