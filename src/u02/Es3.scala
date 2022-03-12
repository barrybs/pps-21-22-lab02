package u02

import Es2.empty

object Es3 {
  //Ex 1c: neg function - part 2 (generic)
  def negGeneric[A]: (A => Boolean) => (A => Boolean) = f => (s => s!="")
  val notEmptyGeneric = negGeneric(empty)
}
