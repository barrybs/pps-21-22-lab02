package u02

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import Es6._

class Es6Test

  @Test def testFibo() : Unit =
    assertEquals((fibo(0),fibo(1),fibo(2), fibo(3), fibo(4)), (0,1,1,2,3))