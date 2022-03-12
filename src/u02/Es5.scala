package u02

object Es5
  def compose (f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))

  def composeGen[A] (f: A => A, g: A => A): A => A =
    x => f(g(x))

