package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import Es4._

class Es4Test

  @Test def testCurriedIntervalDef() : Unit=
    assertTrue(curriedIntervalDef(1)(2)(3))

  @Test def testNonCurriedIntervalDef() : Unit =
    assertTrue(notCurriedIntervalVal (1,2,3))

  @Test def testCurriedIntervalVal() : Unit =
    assertTrue(curriedIntervalVal(1)(2)(3))

  @Test def testNonCurriedIntervalVal() : Unit =
    assertTrue(notCurriedIntervalVal(1,2,3))