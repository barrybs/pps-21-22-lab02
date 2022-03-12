package u02

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import Es7._
import Es7.Shape._


class Es7Test

  @Test def testRectanglePerimeter() : Unit =
    assertEquals(Shape.perimeter(Shape.Rectangle(10,20)),60)

  @Test def testSquarePerimeter() : Unit =
    assertEquals(Shape.perimeter(Shape.Square(10)),40)

  @Test def testCirclePerimeter() : Unit =
    assertEquals(Shape.perimeter(Shape.Circle(10)),2*10*Math.PI)

  @Test def testRectangleArea() : Unit =
    assertEquals(Shape.area(Shape.Rectangle(10,20)),200)

  @Test
  def testSquareArea() : Unit =
    assertEquals(Shape.area(Shape.Square(10)),100)

  @Test def testCircleArea() : Unit =
    assertEquals(Shape.area(Shape.Circle(10)),10*10*Math.PI)

