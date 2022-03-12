package u02

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.Es2.empty
import u02.Es2.notEmpty

class Es2Test
  //Tests for Es 1b
  @Test def testEmpty(): Unit =
    assertTrue(empty(""))
    assertFalse(empty("a"))

  @Test def testNonEmpty(): Unit =
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("a"))

