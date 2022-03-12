package u02
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import Es8._
import Option._

class Es8Test {
  @Test def testFilter(): Unit = {
    assertEquals(filter(Some(5))(_ > 2),Some(5))
    assertEquals(filter(Some(5))(_ > 8),None())
    assertEquals(filter(None[Int]())(_ > 2),None())
  }

  @Test def testMap(): Unit = {
    assertEquals(map(Some(5))(_ > 2),Some(true))
    assertEquals(map(Some(5))(_ > 8),Some(false))
    assertEquals(map(None[Int]())(_ > 2),None())
  }

  @Test def testMap2(): Unit = {
    assertEquals(map2(Some(5))(Some(2))(_>_),Some(true))
    assertEquals(map2(Some(5))(Some(8))(_>_),Some(false))
    assertEquals(map2(Some(5))(None[Int]())(_ > _),None())
    assertEquals(map2(None[Int]())(Some(8))(_ > _),None())
  }

}
