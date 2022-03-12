package u02

object Es2 {
  //EX 1b: neg function - part 1
  val empty: String => Boolean = _ == ""
  val neg: (String => Boolean) => (String => Boolean) = f => (s => s!="")
  val notEmpty = neg(empty)
}
