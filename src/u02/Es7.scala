package u02

object Es7 {

  enum Shape:
    case Rectangle (base: Double, height: Double)
    case Circle (radius: Double)
    case Square (side: Double)

  object Shape:
    def perimeter(s: Shape): Double = s match
      case Rectangle(b,h) => b*2+h*2
      case Circle(r) => 2*r*Math.PI
      case Square(l) => l*4

    def area (s: Shape): Double = s match
      case Rectangle(b,h) => b*h
      case Circle(r) => r*r*Math.PI
      case Square(l) => l*l
}
